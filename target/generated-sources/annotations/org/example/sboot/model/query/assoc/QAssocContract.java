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
import org.example.sboot.model.Contract;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.query.QContract;

/**
 * Association query bean for AssocContract.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocContract<R> extends TQAssocBean<Contract,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PTimestamp<R> whenCreated;
  public PTimestamp<R> whenModified;
  public PString<R> whoCreated;
  public PString<R> whoModified;
  public PBoolean<R> deleted;
  public PString<R> projectName;
  public PSqlDate<R> startDate;
  public PSqlDate<R> endDate;
  public PInteger<R> baseSalary;
  public PEnum<R,StatusEnum> status;
  public QAssocWorker<R> worker;
  public QAssocFile<R> files;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QContract>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QContract>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QContract>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QContract>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocContract(String name, R root) {
    super(name, root);
  }

  public QAssocContract(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
