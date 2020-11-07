package com.nikesh.single_sign_on_oauth2_legacy_stack.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
// @EnableOAuth2Sso annotation we're using to enable Single Sign On
@EnableOAuth2Sso
public class UiSecurityConfig extends WebSecurityConfigurerAdapter {

    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.antMatcher("/**")
                    .authorizeRequests()
                    // index and login pages are the only pages that can be accessed without authentication
                    .antMatchers("/", "/login**")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
    }

}
