package com.sentence.encoder.sentenceencoder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class EncoderRequestDto {
  private ArrayList<String> sentenses;
  private String version;
}
