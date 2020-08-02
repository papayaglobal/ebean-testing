package org.example.sboot.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@Generated("io.ebean.querybean.generator")
@ModuleInfo(entities={"org.example.sboot.model.Contract","org.example.sboot.model.File","org.example.sboot.model.Payment","org.example.sboot.model.Worker"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(org.example.sboot.model.Contract.class);
    entities.add(org.example.sboot.model.File.class);
    entities.add(org.example.sboot.model.Payment.class);
    entities.add(org.example.sboot.model.Worker.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}
