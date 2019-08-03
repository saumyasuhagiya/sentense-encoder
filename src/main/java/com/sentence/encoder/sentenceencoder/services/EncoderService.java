package com.sentence.encoder.sentenceencoder.services;

<<<<<<< HEAD
public interface EncoderService {


=======
import com.sentence.encoder.sentenceencoder.dto.TfResponseDto;

import java.util.ArrayList;

public interface EncoderService {

  TfResponseDto getSymenticAnalysis(ArrayList<String> sentences);
>>>>>>> Initial commit
}
