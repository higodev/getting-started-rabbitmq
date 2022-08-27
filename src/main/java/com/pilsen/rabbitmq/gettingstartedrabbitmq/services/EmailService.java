package com.pilsen.rabbitmq.gettingstartedrabbitmq.services;

import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.requests.EmailRequest;
import com.pilsen.rabbitmq.gettingstartedrabbitmq.web.responses.EmailResponse;

public interface EmailService {

  EmailResponse save(EmailRequest request);

  void sendEmail(EmailResponse emailResponse);
}
