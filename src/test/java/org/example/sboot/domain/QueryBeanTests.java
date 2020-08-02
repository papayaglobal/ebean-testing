package org.example.sboot.domain;

import io.ebean.DB;
import io.ebean.annotation.Transactional;
import io.ebean.test.ForTests;
import io.ebean.test.UserContext;
import org.example.sboot.domain.query.QWorker;
import org.example.sboot.domain.repo.WorkerRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QueryBeanTests {
  ForTests.RollbackAll rollbackAll;

  @Before
  public void before() {
    // create our "wrapping" transaction (all nested transactions will be savepoints)
    rollbackAll = ForTests.createRollbackAll();
  }

  @After
  public void after() {
    // rollback our "wrapping" transaction
    rollbackAll.close();

    // Just for kicks - we no longer see the commited changes ... as "wrapped transaction" has rolled back
    //assertThat(getCount()).isEqualTo(0);
  }

  @Test
  @Transactional
  public void testUsingQuery1Beans() {
    UserContext.setUserId("U1");

    Worker worker = new Worker();
    worker.setFirstName("Jessie");
    worker.setLastName("Randolph");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(5);

    worker.save();
  }

  @Test
  @Transactional
  public void testUsingQueryBeans() {
    UserContext.setUserId("U1");

    Worker worker = new Worker();
    worker.setFirstName("Jessie");
    worker.setLastName("Randolph");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(5);

    worker.save();

    Worker worker2 = new Worker();
    worker2.setFirstName("Rhiana");
    worker2.setLastName("Alston");
    worker2.setMaritalStatus("Single");
    worker2.setNumOfChildren(5);

    worker2.save();

    List<Worker> workers = new QWorker().firstName.contains("ssi").findList();
    assertEquals(1, workers.size());

    workers = new QWorker().numOfChildren.eq(5).findList();
    assertEquals(2, workers.size());
  }

  @Test
  @Transactional
  public void testUsingRepository() {
    UserContext.setUserId("U1");
    WorkerRepository workerRepository = new WorkerRepository(DB.getDefault());

    Worker worker = new Worker();
    worker.setFirstName("Tom");
    worker.setLastName("Jones");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(0);

    workerRepository.save(worker);

    Worker verifyWorker = workerRepository.findByFirstName("Tom");
    assertNotNull(verifyWorker);
  }
}
