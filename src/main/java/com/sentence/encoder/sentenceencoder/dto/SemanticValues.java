package com.sentence.encoder.sentenceencoder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SemanticValues {
  private Integer id;
  private Double value;
  private String sentence;
}
