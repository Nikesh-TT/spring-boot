package com.nikesh.single_sign_on_auth_server_res_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
// configuration of our Resource Server – which doubles as our primary Boot application
@EnableResourceServer
public class SingleSignOnAuthServerResServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnAuthServerResServerApplication.class, args);
	}

}
