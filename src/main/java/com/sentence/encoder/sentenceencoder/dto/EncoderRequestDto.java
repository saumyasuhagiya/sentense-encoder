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
<<<<<<< HEAD
  private ArrayList<String> sentenses;
=======
  private ArrayList<String> sentences;
>>>>>>> Initial commit
  private String version;
}
