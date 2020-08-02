package org.example.sboot.domain;

import io.ebean.DB;
import io.ebean.test.UserContext;
import org.example.sboot.TestUtils;
import org.example.sboot.domain.query.QWorker;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;

public class PartialUpdateTests {
  @Test
  public void testHistoryQueries() {

    UserContext.setUserId("U1");
    // Initial worker creation
    Worker worker = new Worker();
    worker.setFirstName("Layla");
    worker.setLastName("Mercer");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(0);
    Contract contract = new Contract();
    contract.setBaseSalary(1000);
    contract.setProjectName("Project1");
    contract.setStartDate(TestUtils.getDate("01-01-2020"));
    worker.getContracts().add(contract);

    worker.save();

    worker.setNumOfChildren(1);

    worker.save();

    Long id = worker.getId();

    // Service - updateWorkerFirstName(id, firtsname)
    Worker worker1 = new Worker();
    worker1.setId(id);
    worker1.setFirstName("Layla");
    worker1.setVersion(2L);
//    worker1.setLastName("Mercer");
//    worker1.setMaritalStatus("Single");
//    worker1.setNumOfChildren(3);

    DB.update(worker1);
    worker1 = new QWorker().id.eq(worker.getId()).findOne();
    assertNotNull(worker1);
  }
}
