package org.example.sboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.sboot.model.StatusEnum;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WorkerDomain extends BaseDomain {
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private List<ContractDomain> contracts;
  private StatusEnum status;
}
