package com.pilsen.rabbitmq.gettingstartedrabbitmq.rabbitmq.producers;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.requests.EmailRequest;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.responses.EmailResponse;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.services.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailProducer {

  private final EmailService emailService;
  private final RabbitTemplate rabbitTemplate;
  private final Queue queue;

  public void send(final EmailRequest emailRequest) {
    final EmailResponse emailResponse = emailService.save(emailRequest);
    rabbitTemplate.convertAndSend(this.queue.getName(), emailResponse);
  }
}
