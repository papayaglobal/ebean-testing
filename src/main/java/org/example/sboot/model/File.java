package org.example.sboot.model;

import io.ebean.annotation.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@History
@Table(name = "files")
public class File extends BaseModel {
  private String name;
  private String url;
  private StatusEnum status;
  @ManyToOne(
    fetch = FetchType.LAZY,
    cascade = {
      CascadeType.MERGE,
      CascadeType.PERSIST,
      CascadeType.REFRESH
    }
  )
  @JoinColumn(name = "contract")
  private Contract contract;
}
