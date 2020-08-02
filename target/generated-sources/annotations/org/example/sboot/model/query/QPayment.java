package org.example.sboot.model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PLocalDateTime;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import org.example.sboot.model.Payment;
import org.example.sboot.model.query.assoc.QAssocWorker;

/**
 * Query bean for Payment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QPayment extends TQRootBean<Payment,QPayment> {

  private static final QPayment _alias = new QPayment(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QPayment alias() {
    return _alias;
  }

  public PLong<QPayment> id;
  public PLong<QPayment> version;
  public PTimestamp<QPayment> whenCreated;
  public PTimestamp<QPayment> whenModified;
  public PString<QPayment> whoCreated;
  public PString<QPayment> whoModified;
  public PBoolean<QPayment> deleted;
  public PLocalDateTime<QPayment> executedAt;
  public PInstant<QPayment> payedAt;
  public PBigDecimal<QPayment> payedAmount;
  public PString<QPayment> payedAmountCurrency;
  public QAssocWorker<QPayment> worker;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QPayment forFetchGroup() {
    return new QPayment(FetchGroup.queryFor(Payment.class));
  }

  /**
   * Construct using the default Database.
   */
  public QPayment() {
    super(Payment.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QPayment(Transaction transaction) {
    super(Payment.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QPayment(Database database) {
    super(Payment.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QPayment(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QPayment(Query<Payment> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QPayment> id = _alias.id;
    public static PLong<QPayment> version = _alias.version;
    public static PTimestamp<QPayment> whenCreated = _alias.whenCreated;
    public static PTimestamp<QPayment> whenModified = _alias.whenModified;
    public static PString<QPayment> whoCreated = _alias.whoCreated;
    public static PString<QPayment> whoModified = _alias.whoModified;
    public static PBoolean<QPayment> deleted = _alias.deleted;
    public static PLocalDateTime<QPayment> executedAt = _alias.executedAt;
    public static PInstant<QPayment> payedAt = _alias.payedAt;
    public static PBigDecimal<QPayment> payedAmount = _alias.payedAmount;
    public static PString<QPayment> payedAmountCurrency = _alias.payedAmountCurrency;
    public static QAssocWorker<QPayment> worker = _alias.worker;
  }
}
