package org.example.sboot.service;

import io.ebean.EbeanServer;
import io.ebean.Transaction;
import io.ebean.event.BeanPersistAdapter;
import io.ebean.event.BeanPersistRequest;
import org.springframework.stereotype.Service;

@Service
public class BeanPersistAdapterImpl extends BeanPersistAdapter {
  @Override
  public boolean isRegisterFor(Class<?> cls) {
    return true;
  }

  /**
   * Does nothing by default.
   */
  @Override
  public void postSoftDelete(BeanPersistRequest<?> request) {
//    Transaction t = request.getTransaction();
//    EbeanServer server = request.getEbeanServer();
//    server.deletePermanent(request.getBean(), t);
  }
}
