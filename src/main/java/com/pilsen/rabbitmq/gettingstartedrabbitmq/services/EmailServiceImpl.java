package com.pilsen.rabbitmq.gettingstartedrabbitmq.services;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.domain.EmailEntity;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.rabbitmq.producers.EmailProducer;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.requests.EmailRequest;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.responses.EmailResponse;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.repositories.EmailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

  private final EmailRepository repository;

//  private final JavaMailSender mailSender;

  @Override
  public EmailResponse save(final EmailRequest request) {

    final EmailEntity entity = new EmailEntity();
    BeanUtils.copyProperties(request, entity);

    repository.saveAndFlush(entity);

    final EmailResponse response = new EmailResponse();
    BeanUtils.copyProperties(entity, response);

    return response;
  }

  @Override
  public void sendEmail(final EmailResponse response) {
    log.info("email sent, body={}", response);
  }
}
