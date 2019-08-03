package com.sentence.encoder.sentenceencoder.services;

import com.sentence.encoder.sentenceencoder.dto.TfResponseDto;

import java.util.ArrayList;

public class EncoderServiceImpl implements EncoderService {
  @Override
  public TfResponseDto getSymenticAnalysis(ArrayList<String> sentences) {
    //connect to TF sentence encoder and get response
    // build dto and return back to client
    return null;
  }
}
