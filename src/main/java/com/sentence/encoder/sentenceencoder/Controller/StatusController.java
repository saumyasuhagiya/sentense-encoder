package com.sentence.encoder.sentenceencoder.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StatusController {


  @RequestMapping(value = "/status", method = RequestMethod.GET)
  public ResponseEntity<String> status() {
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
