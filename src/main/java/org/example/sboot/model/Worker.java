package org.example.sboot.model;

import io.ebean.annotation.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@History
@Table(name = "worker")
public class Worker extends BaseModel {
  String firstName;
  String lastName;
  String maritalStatus;

  int numOfChildren;
  Date dateOfBirth;
  @OneToMany(
    mappedBy = "worker",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  List<Contract> contracts;
  @OneToMany(
    mappedBy = "worker",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  List<Payment> payments;
  private StatusEnum status;
}
