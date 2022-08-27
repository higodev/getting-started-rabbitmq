package com.pilsen.rabbitmq.gettingstartedrabbitmq.rabbitmq.consumers;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.responses.EmailResponse;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.services.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailConsumer {

  private final EmailService emailService;

  @RabbitListener(queues = "${spring.rabbitmq.queue}")
  public void listen(@Payload EmailResponse emailResponse) {
    emailService.sendEmail(emailResponse);
  }
}
