package com.sentence.encoder.sentenceencoder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EncoderResponse {

  private Integer id;
  private String sentence;
<<<<<<< HEAD
  private ArrayList<SementicValues> sementicValues;
=======
  private ArrayList<SemanticValues> semanticValues;
>>>>>>> Initial commit
}
