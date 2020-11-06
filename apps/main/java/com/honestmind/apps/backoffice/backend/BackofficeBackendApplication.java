package com.honestmind.apps.backoffice.backend;

import java.util.HashMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = {
      "com.honestmind.shared",
      "com.honestmind.backoffice",
      "com.honestmind.apps.backoffice.backend"
    })
public class BackofficeBackendApplication {
  public static HashMap<String, Class<?>> commands() {
    return new HashMap<>() {
      {
      }
    };
  }
}
