Enable Oauth2(Basic+password granttype) in Springboot 2.0,OAuth2LoginAuthenticationFilter class not found error
Since OAuth2LoginAuthenticationFilter is in the artifact spring-security-oauth2-client, I'd assume that there was a problem with the dependencies.
Try to add a version to your spring-security-oauth2-client dependency, like so:

    <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-oauth2-client</artifactId>
    </dependency>
<br/> `<span th:text="${#authentication.name}">` requires org.thymeleaf.extras:thymeleaf-extras-springsecurity5 dependency if your IDE is not able to resolve this dependency, download it manually from: https://jar-download.com/
    
    <dependency>
			<groupId>org.thymeleaf.extras</groupId>
			<artifactId>thymeleaf-extras-springsecurity5</artifactId>
			<version>3.0.4.RELEASE</version>
	</dependency>
