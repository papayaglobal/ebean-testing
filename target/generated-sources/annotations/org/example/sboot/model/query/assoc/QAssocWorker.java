package org.example.sboot.model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PEnum;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PSqlDate;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.Worker;
import org.example.sboot.model.query.QWorker;

/**
 * Association query bean for AssocWorker.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocWorker<R> extends TQAssocBean<Worker,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PTimestamp<R> whenCreated;
  public PTimestamp<R> whenModified;
  public PString<R> whoCreated;
  public PString<R> whoModified;
  public PBoolean<R> deleted;
  public PString<R> firstName;
  public PString<R> lastName;
  public PString<R> maritalStatus;
  public PInteger<R> numOfChildren;
  public PSqlDate<R> dateOfBirth;
  public QAssocContract<R> contracts;
  public QAssocPayment<R> payments;
  public PEnum<R,StatusEnum> status;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QWorker>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QWorker>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QWorker>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QWorker>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocWorker(String name, R root) {
    super(name, root);
  }

  public QAssocWorker(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
