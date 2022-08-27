package com.pilsen.rabbitmq.gettingstartedrabbitmq.web.responses;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EmailResponse implements Serializable {

  private static final long serialVersionUID = -1191575849610125369L;

  private String emailFrom;
  private String emailTo;
  private String subject;
  private String text;
}
