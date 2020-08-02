package org.example.sboot.model;

import io.ebean.annotation.History;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@History
@Table(name = "worker_contract")
public class Contract extends BaseModel {
  String projectName;
  Date startDate;
  Date endDate;
  int baseSalary;
  private StatusEnum status;
  @ManyToOne(
    fetch = FetchType.LAZY,
    cascade = {
      CascadeType.MERGE,
      CascadeType.PERSIST,
      CascadeType.REFRESH
    }
  )
  @JoinColumn(name = "worker")
  Worker worker;
  @OneToMany(
    fetch = FetchType.LAZY,
    mappedBy = "contract",
    cascade = CascadeType.ALL
  )
  private List<File> files = new ArrayList<>();

  public String getProjectName() {
    return projectName;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public StatusEnum getStatus() {
    return status;
  }

  public Worker getWorker() {
    return worker;
  }

  public List<File> getFiles() {
    return files;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public void setWorker(Worker worker) {
    this.worker = worker;
  }

  public void setFiles(List<File> files) {
    this.files = files;
  }
}
