package com.honestmind.apps.backoffice.frontend.config;

import com.honestmind.shared.infrastructure.config.Parameter;
import com.honestmind.shared.infrastructure.config.ParameterNotExist;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public final class BackofficeFrontendServerPortCustomizer
    implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
  private final Parameter param;

  public BackofficeFrontendServerPortCustomizer(Parameter param) {
    this.param = param;
  }

  @Override
  public void customize(ConfigurableWebServerFactory factory) {
    try {
      factory.setPort(param.getInt("BACKOFFICE_FRONTEND_SERVER_PORT"));
    } catch (ParameterNotExist parameterNotExist) {
      parameterNotExist.printStackTrace();
    }
  }
}
