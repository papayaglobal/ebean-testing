package org.example.sboot.domain;

import io.ebean.annotation.History;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
@Entity
@History
@Table(name = "payer")
public class Payer extends BaseModel {
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "orgId")
    private Organization organization;
}
