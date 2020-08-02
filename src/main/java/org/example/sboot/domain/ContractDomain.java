package org.example.sboot.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.sboot.model.StatusEnum;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ContractDomain extends BaseDomain {
  private String projectName;
  private Date startDate;
  private Date endDate;
  private int baseSalary;
  private StatusEnum status;
  private WorkerDomain worker;
  private List<FileDomain> files = new ArrayList<>();

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

  public WorkerDomain getWorker() {
    return worker;
  }

  public List<FileDomain> getFiles() {
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

  public void setWorker(WorkerDomain worker) {
    this.worker = worker;
  }

  public void setFiles(List<FileDomain> files) {
    this.files = files;
  }
}
