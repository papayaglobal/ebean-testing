package org.example.sboot.domain;

import io.ebean.annotation.History;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
@Entity
@History
@Table(name = "org")
public class Organization extends BaseModel {

    private String name;
    @ToString.Exclude
    @OneToMany(
            mappedBy = "organization",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(
            name = "orgId",
            referencedColumnName = "id")
    private List<Payer> payers = new ArrayList<>();
}
