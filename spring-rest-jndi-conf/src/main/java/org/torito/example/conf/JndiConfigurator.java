package org.torito.example.conf;

import org.springframework.stereotype.Component;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by IGA3303 on 26/02/2016.
 */
@Component
public class JndiConfigurator {
  public String getConfig(String name, String defaultValue) {
    String value = getConfig(name);
    if(value == null) {
      value = defaultValue;
    }
    return value;
  }

  public String getConfig(String name) {
    if(name == null) return null;
    try {
      final Object object = ((Context)(new InitialContext().lookup("java:comp/env"))).lookup(name);
      if (object != null) return object.toString();
    } catch (final Exception e) {}
    return System.getenv(name);
  }

}
