package com.sentence.encoder.sentenceencoder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class TfResponseDto {

  public String sentence;
  public ArrayList<Double> similarityEncodings;
}
