package org.example.sboot.domain;

import io.ebean.test.UserContext;
import org.example.sboot.model.Contract;
import org.example.sboot.model.File;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.Worker;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
public class UpdateTest {
  @Test
  public void updateThroughGrandson() {
    ModelMapper modelMapper = initModelMapper();
    UserContext.setUserId("U1");

    Worker worker = new Worker();
    worker.setFirstName("John");
    worker.setLastName("Doe");
    worker.setStatus(StatusEnum.DRAFT);

    Contract contract = new Contract();
    contract.setStatus(StatusEnum.DRAFT);
    contract.setProjectName("workers-project");

    File fileFromDb = new File();
    fileFromDb.setName("CV");
    fileFromDb.setStatus(StatusEnum.DRAFT);

    worker.save();

    contract.setWorker(worker);
    contract.save();

    fileFromDb.setContract(contract);
    fileFromDb.save();

    worker.getContracts().add(contract);
    contract.getFiles().add(fileFromDb);

    //without mapping - works
    fileFromDb.getContract().getWorker().setStatus(StatusEnum.ACTIVE);
    fileFromDb.getContract().setStatus(StatusEnum.ACTIVE);
    fileFromDb.setStatus(StatusEnum.ACTIVE);
    fileFromDb.save();
    //endregion

    //fetch file from DB...
    FileDomain fileDomain = modelMapper.map(fileFromDb, FileDomain.class);
    fileDomain.getContract().getWorker().setStatus(StatusEnum.ACTIVE);
    fileDomain.getContract().setStatus(StatusEnum.ACTIVE);
    fileDomain.setStatus(StatusEnum.ACTIVE);
    File fileModel = modelMapper.map(fileDomain, File.class);
    fileModel.update();
  }

  private ModelMapper initModelMapper() {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
      .setAmbiguityIgnored(true)
      .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
      .setSkipNullEnabled(true);

    return modelMapper;
  }
}
