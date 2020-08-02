package org.example.sboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentDomain {
  private Long id;
  private LocalDateTime executedAt;
  private Instant payedAt;
  private BigDecimal payedAmount;
  private String payedAmountCurrency;
  private WorkerDomain worker;
}
