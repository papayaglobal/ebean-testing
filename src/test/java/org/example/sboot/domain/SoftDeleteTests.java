package org.example.sboot.domain;

import io.ebean.DB;
import io.ebean.test.UserContext;
import org.example.sboot.TestUtils;
import org.example.sboot.domain.query.QContract;
import org.example.sboot.domain.query.QContractWallet;
import org.example.sboot.domain.query.QWorker;
import org.example.sboot.domain.repo.WorkerRepository;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SoftDeleteTests {
  WorkerRepository workerRepository = new WorkerRepository(DB.getDefault());
  @Test
  public void testSoftDelete() {

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
    contract.setEndDate(TestUtils.getDate("30-04-2020"));
    worker.getContracts().add(contract);

    Contract contract1 = new Contract();
    contract.setBaseSalary(2000);
    contract.setProjectName("Project2");
    contract.setStartDate(TestUtils.getDate("01-05-2020"));
    worker.getContracts().add(contract1);

    worker.save();

    assertEquals(2, worker.getContracts().size());

    contract.delete();

    Worker worker1 = new QWorker().id.eq(worker.getId()).findOne();

    assertEquals(1, worker1.getContracts().size());

    List<Contract> contractList = new QContract().setIncludeSoftDeletes().worker.id.eq(worker.getId()).findList();

    assertEquals(2, contractList.size());
  }

  @Test
  public void testSoftDeleteAndPermamnent() {
    UserContext.setUserId("U1");
    Worker worker = new Worker();
    worker.setFirstName("Layla");
    worker.setLastName("Mercer");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(0);

    Contract contract = new Contract();
    contract.setBaseSalary(1000);
    contract.setProjectName("Project1");
    contract.setStartDate(TestUtils.getDate("01-01-2020"));
    contract.setEndDate(TestUtils.getDate("30-04-2020"));

    ContractWallet wallet = new ContractWallet();
    wallet.setWalletName("TestWallet");

    contract.getWallets().add(wallet);

    worker.getContracts().add(contract);
    worker.save();

    worker.setNumOfChildren(1);

    ContractWallet contractWallet = new QContractWallet().id.eq(1).findOne();

    contractWallet.setWalletName("inbal");

    contractWallet.getContract().setBaseSalary(2000);

    contractWallet.getContract().getWorker().setNumOfChildren(2);

    contractWallet.save();
  }

  @Test
  public void testQuery() {
    UserContext.setUserId("U1");
    Worker worker = new Worker();
    worker.setFirstName("Layla");
    worker.setLastName("Mercer");
    worker.setMaritalStatus("Single");
    worker.setNumOfChildren(0);
    worker.save();

    Worker worker2 = new Worker();
    worker2.setFirstName("Tim");
    worker2.setLastName("Spencer");
    worker2.setMaritalStatus("Single");
    worker2.setNumOfChildren(0);
    worker2.save();

    List<Worker> workers = new QWorker()
      .or()
      .firstName.contains("er")
      .lastName.contains("er")
      .endOr()
      .findList();

    //List<Worker> workers = workerRepository.findContains("er");
    assertNotNull(workers);
  }
}
