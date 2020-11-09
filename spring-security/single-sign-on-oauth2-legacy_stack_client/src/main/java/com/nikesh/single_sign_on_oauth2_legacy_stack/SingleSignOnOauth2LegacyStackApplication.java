package com.nikesh.single_sign_on_oauth2_legacy_stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class SingleSignOnOauth2LegacyStackApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnOauth2LegacyStackApplication.class, args);
	}

}
