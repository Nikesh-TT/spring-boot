package com.nikesh.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

// To disable the security auto-configuration (Or by adding some configuration into the application.properties file:
// spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration)
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
// If we want our application to be an OAuth2 provider (server)
@EnableAuthorizationServer
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
