package org.example.sboot.model;

import io.ebean.Model;
import io.ebean.annotation.*;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseModel extends Model {

  @Id
  Long id;

  @Version
  Long version;

  @WhenCreated
  Timestamp whenCreated;

  @WhenModified
  Timestamp whenModified;

  @WhoCreated
  String whoCreated;

  @WhoModified
  String whoModified;

  @SoftDelete
  boolean deleted;

  public Long getId() {
    return id;
  }

  public Long getVersion() {
    return version;
  }

  public Timestamp getWhenCreated() {
    return whenCreated;
  }

  public Timestamp getWhenModified() {
    return whenModified;
  }

  public String getWhoCreated() {
    return whoCreated;
  }

  public String getWhoModified() {
    return whoModified;
  }

  public boolean isDeleted() {
    return deleted;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public void setWhenCreated(Timestamp whenCreated) {
    this.whenCreated = whenCreated;
  }

  public void setWhenModified(Timestamp whenModified) {
    this.whenModified = whenModified;
  }

  public void setWhoCreated(String whoCreated) {
    this.whoCreated = whoCreated;
  }

  public void setWhoModified(String whoModified) {
    this.whoModified = whoModified;
  }

  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }
}
