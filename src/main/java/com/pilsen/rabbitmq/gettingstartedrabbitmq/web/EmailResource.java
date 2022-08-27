package com.pilsen.rabbitmq.gettingstartedrabbitmq.web;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.rabbitmq.producers.EmailProducer;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.requests.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
@RequiredArgsConstructor
public class EmailResource {

  private final EmailProducer producer;

  @PostMapping
  public void producerSendEmail(@RequestBody final EmailRequest request) {
    producer.send(request);
  }

}
