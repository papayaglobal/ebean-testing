package org.example.sboot.model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PEnum;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import org.example.sboot.model.File;
import org.example.sboot.model.StatusEnum;
import org.example.sboot.model.query.assoc.QAssocContract;

/**
 * Query bean for File.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QFile extends TQRootBean<File,QFile> {

  private static final QFile _alias = new QFile(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QFile alias() {
    return _alias;
  }

  public PLong<QFile> id;
  public PLong<QFile> version;
  public PTimestamp<QFile> whenCreated;
  public PTimestamp<QFile> whenModified;
  public PString<QFile> whoCreated;
  public PString<QFile> whoModified;
  public PBoolean<QFile> deleted;
  public PString<QFile> name;
  public PString<QFile> url;
  public PEnum<QFile,StatusEnum> status;
  public QAssocContract<QFile> contract;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QFile forFetchGroup() {
    return new QFile(FetchGroup.queryFor(File.class));
  }

  /**
   * Construct using the default Database.
   */
  public QFile() {
    super(File.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QFile(Transaction transaction) {
    super(File.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QFile(Database database) {
    super(File.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QFile(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QFile(Query<File> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QFile> id = _alias.id;
    public static PLong<QFile> version = _alias.version;
    public static PTimestamp<QFile> whenCreated = _alias.whenCreated;
    public static PTimestamp<QFile> whenModified = _alias.whenModified;
    public static PString<QFile> whoCreated = _alias.whoCreated;
    public static PString<QFile> whoModified = _alias.whoModified;
    public static PBoolean<QFile> deleted = _alias.deleted;
    public static PString<QFile> name = _alias.name;
    public static PString<QFile> url = _alias.url;
    public static PEnum<QFile,StatusEnum> status = _alias.status;
    public static QAssocContract<QFile> contract = _alias.contract;
  }
}
