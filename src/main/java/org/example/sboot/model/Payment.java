package org.example.sboot.model;

import io.ebean.annotation.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@History
@Table(name = "worker_payment")
public class Payment extends BaseModel {
    LocalDateTime executedAt;
    Instant payedAt;
    BigDecimal payedAmount;
    String payedAmountCurrency;
    @ManyToOne(fetch = FetchType.LAZY)
    Worker worker;
}
