package com.pilsen.rabbitmq.gettingstartedrabbitmq.web.requests;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest implements Serializable {

  private static final long serialVersionUID = -2361018947542949857L;

  private String emailFrom;
  private String emailTo;
  private String subject;
  private String text;
}
