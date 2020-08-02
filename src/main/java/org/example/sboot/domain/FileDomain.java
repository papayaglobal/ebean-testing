package org.example.sboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.sboot.model.StatusEnum;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FileDomain extends BaseDomain {
  private String name;
  private String url;
  private StatusEnum status;
  private ContractDomain contract;
}
