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
import org.example.sboot.model.Contract;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.query.assoc.QAssocFile;
import org.example.sboot.model.query.assoc.QAssocWorker;

/**
 * Query bean for Contract.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QContract extends TQRootBean<Contract,QContract> {

  private static final QContract _alias = new QContract(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QContract alias() {
    return _alias;
  }

  public PLong<QContract> id;
  public PLong<QContract> version;
  public PTimestamp<QContract> whenCreated;
  public PTimestamp<QContract> whenModified;
  public PString<QContract> whoCreated;
  public PString<QContract> whoModified;
  public PBoolean<QContract> deleted;
  public PString<QContract> projectName;
  public PSqlDate<QContract> startDate;
  public PSqlDate<QContract> endDate;
  public PInteger<QContract> baseSalary;
  public PEnum<QContract,StatusEnum> status;
  public QAssocWorker<QContract> worker;
  public QAssocFile<QContract> files;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QContract forFetchGroup() {
    return new QContract(FetchGroup.queryFor(Contract.class));
  }

  /**
   * Construct using the default Database.
   */
  public QContract() {
    super(Contract.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QContract(Transaction transaction) {
    super(Contract.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QContract(Database database) {
    super(Contract.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QContract(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QContract(Query<Contract> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QContract> id = _alias.id;
    public static PLong<QContract> version = _alias.version;
    public static PTimestamp<QContract> whenCreated = _alias.whenCreated;
    public static PTimestamp<QContract> whenModified = _alias.whenModified;
    public static PString<QContract> whoCreated = _alias.whoCreated;
    public static PString<QContract> whoModified = _alias.whoModified;
    public static PBoolean<QContract> deleted = _alias.deleted;
    public static PString<QContract> projectName = _alias.projectName;
    public static PSqlDate<QContract> startDate = _alias.startDate;
    public static PSqlDate<QContract> endDate = _alias.endDate;
    public static PInteger<QContract> baseSalary = _alias.baseSalary;
    public static PEnum<QContract,StatusEnum> status = _alias.status;
    public static QAssocWorker<QContract> worker = _alias.worker;
    public static QAssocFile<QContract> files = _alias.files;
  }
}
