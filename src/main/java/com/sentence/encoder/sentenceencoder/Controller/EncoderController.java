package com.sentence.encoder.sentenceencoder.Controller;

import com.sentence.encoder.sentenceencoder.dto.EncoderRequestDto;
import com.sentence.encoder.sentenceencoder.dto.EncoderResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1/encoder")
public class EncoderController {

    private final Logger log = LogManager.getLogger(EncoderController.class);

    @RequestMapping(value = "/generateMapping", method = RequestMethod.POST)
    public ResponseEntity<EncoderResponse> processEncoding(@RequestBody EncoderRequestDto encoderRequestDto) {
      log.debug("got encoding msg req");

      return new ResponseEntity<>(new EncoderResponse(), HttpStatus.OK);
    }

  }
