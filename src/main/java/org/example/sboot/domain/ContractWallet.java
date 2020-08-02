package org.example.sboot.domain;


import io.ebean.annotation.History;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@History
@Table(name = "worker_contract_wallet")
public class ContractWallet extends BaseModel {

  String walletName;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  Contract contract;
}
