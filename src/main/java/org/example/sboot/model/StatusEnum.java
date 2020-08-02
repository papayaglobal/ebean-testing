package org.example.sboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
  ACTIVE("active"),
  DRAFT("draft"),
  CLOSED("closed");

  private final String value;
}
