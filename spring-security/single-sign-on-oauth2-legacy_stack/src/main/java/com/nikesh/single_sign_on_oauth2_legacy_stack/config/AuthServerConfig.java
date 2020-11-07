package com.nikesh.single_sign_on_oauth2_legacy_stack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
//              only enabling a simple client using the authorization_code grant type
               .withClient("SampleClientId")
               .secret(passwordEncoder.encode("secret"))
               .authorizedGrantTypes("authorization_code")
               .scopes("user_info")
//              autoApprove is set to true so that we're not redirected and promoted to manually approve any scopes
               .autoApprove(true)
               .redirectUris(
                       "http://localhost:8082/ui/login", "http://localhost:8083/ui2/login"
               );
    }
}
