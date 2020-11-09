Enable Oauth2(Basic+password granttype) in Springboot 2.0,OAuth2LoginAuthenticationFilter class not found error
Since OAuth2LoginAuthenticationFilter is in the artifact spring-security-oauth2-client, I'd assume that there was a problem with the dependencies.
Try to add a version to your spring-security-oauth2-client dependency, like so:
    <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-oauth2-client</artifactId>
    </dependency>
