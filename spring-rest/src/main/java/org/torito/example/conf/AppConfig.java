package org.torito.example.conf;

/**
 * Created by issac on 17/02/16.
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration

@ComponentScan("org.torito.example.resources")
@EnableWebMvc
public class AppConfig {
}