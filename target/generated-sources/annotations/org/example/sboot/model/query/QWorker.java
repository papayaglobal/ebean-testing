package org.example.sboot.model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PEnum;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PSqlDate;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.Worker;
import org.example.sboot.model.query.assoc.QAssocContract;
import org.example.sboot.model.query.assoc.QAssocPayment;

/**
 * Query bean for Worker.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QWorker extends TQRootBean<Worker,QWorker> {

  private static final QWorker _alias = new QWorker(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QWorker alias() {
    return _alias;
  }

  public PLong<QWorker> id;
  public PLong<QWorker> version;
  public PTimestamp<QWorker> whenCreated;
  public PTimestamp<QWorker> whenModified;
  public PString<QWorker> whoCreated;
  public PString<QWorker> whoModified;
  public PBoolean<QWorker> deleted;
  public PString<QWorker> firstName;
  public PString<QWorker> lastName;
  public PString<QWorker> maritalStatus;
  public PInteger<QWorker> numOfChildren;
  public PSqlDate<QWorker> dateOfBirth;
  public QAssocContract<QWorker> contracts;
  public QAssocPayment<QWorker> payments;
  public PEnum<QWorker,StatusEnum> status;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QWorker forFetchGroup() {
    return new QWorker(FetchGroup.queryFor(Worker.class));
  }

  /**
   * Construct using the default Database.
   */
  public QWorker() {
    super(Worker.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QWorker(Transaction transaction) {
    super(Worker.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QWorker(Database database) {
    super(Worker.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QWorker(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QWorker(Query<Worker> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QWorker> id = _alias.id;
    public static PLong<QWorker> version = _alias.version;
    public static PTimestamp<QWorker> whenCreated = _alias.whenCreated;
    public static PTimestamp<QWorker> whenModified = _alias.whenModified;
    public static PString<QWorker> whoCreated = _alias.whoCreated;
    public static PString<QWorker> whoModified = _alias.whoModified;
    public static PBoolean<QWorker> deleted = _alias.deleted;
    public static PString<QWorker> firstName = _alias.firstName;
    public static PString<QWorker> lastName = _alias.lastName;
    public static PString<QWorker> maritalStatus = _alias.maritalStatus;
    public static PInteger<QWorker> numOfChildren = _alias.numOfChildren;
    public static PSqlDate<QWorker> dateOfBirth = _alias.dateOfBirth;
    public static QAssocContract<QWorker> contracts = _alias.contracts;
    public static QAssocPayment<QWorker> payments = _alias.payments;
    public static PEnum<QWorker,StatusEnum> status = _alias.status;
  }
}
