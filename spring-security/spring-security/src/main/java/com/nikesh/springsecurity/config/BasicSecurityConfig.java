package com.nikesh.springsecurity.config;

import com.nikesh.springsecurity.utils.CustomAuthenticationFailureHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

//The @EnableWebSecurity annotation is crucial if we disable the default security configuration.
@Configuration
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        we need to use the PasswordEncoder to set the passwords when using Spring Boot 2
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password(encoder.encode("user123"))
                .roles("USER")
                .and()
                .withUser("admin")
                .password(encoder.encode("admin123"))
                .roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
//                With out roles
//                .anyRequest()
//                .authenticated()
//                With roles
//                path="/*" matches any URL in the "/" directory, and path="/**" matches any URL in the entire directory tree
                .antMatchers("/api/*")
                .access("hasRole('ROLE_ADMIN')")
                .and()
                .httpBasic()
                .and()
                .formLogin()
                .failureHandler(authenticationFailureHandler());
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler(){
        return new CustomAuthenticationFailureHandler();
    }

//    If we need to use BCryptPasswordEncoder specific
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
