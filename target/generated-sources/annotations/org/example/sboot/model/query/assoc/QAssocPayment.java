package org.example.sboot.model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PLocalDateTime;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import org.example.sboot.model.Payment;
import org.example.sboot.model.query.QPayment;

/**
 * Association query bean for AssocPayment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocPayment<R> extends TQAssocBean<Payment,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PTimestamp<R> whenCreated;
  public PTimestamp<R> whenModified;
  public PString<R> whoCreated;
  public PString<R> whoModified;
  public PBoolean<R> deleted;
  public PLocalDateTime<R> executedAt;
  public PInstant<R> payedAt;
  public PBigDecimal<R> payedAmount;
  public PString<R> payedAmountCurrency;
  public QAssocWorker<R> worker;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QPayment>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QPayment>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QPayment>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QPayment>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocPayment(String name, R root) {
    super(name, root);
  }

  public QAssocPayment(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
