package org.example.sboot.domain;

import io.ebean.annotation.History;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@History
@Table(name = "worker_contract")
public class Contract extends BaseModel {
    @GraphQLQuery(name = "projectName", description = "Worker's first name")
    String projectName;
    Date startDate;
    Date endDate;
    int baseSalary;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    Worker worker;

    @OneToMany(
      mappedBy = "contract",
      cascade = CascadeType.ALL,
      orphanRemoval = true
    )
    List<ContractWallet> wallets;
}
