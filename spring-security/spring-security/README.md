# Spring Security
<br/> Tutorial followed for Spring Security: https://www.baeldung.com/spring-boot-security-autoconfiguration
<br/> difference between /** and /* in Spring:
<br/> It is documented here:

     http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-ann-requestmapping-pattern-comparison
     Basically the Spring supports "Ant style globbing". Thus path="/*" matches any URL in the "/" directory1, and path="/**" matches any URL in the entire directory tree. 
     The document primarily talks about request mappings specified using annotations, but wirings specified using XML have the same meaning.
 
 <br/> Spring Security Custom AuthenticationFailureHandler: spring boot returns 500 instead of 401
 <br/> https://www.baeldung.com/spring-security-custom-authentication-failure-handler (Spring Security Custom
  AuthenticationFailureHandler)
 <br/> Import object mapper from:
 
     <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
     </dependency>
 <br/> AuthorizationServerSecurityConfiguration required a bean of type 'java.util.List' that could not be found

     Either Do:
     @Configuration
     @EnableAuthorizationServer  //Open the authentication Server
     public class CoreqiAuthorizationServerConfig implements AuthorizationServerConfigurer {
     }
     Or:
     Change your OAuth2 dependency with this:
     
     <dependency>
         <groupId>org.springframework.security.oauth.boot</groupId>
         <artifactId>spring-security-oauth2-autoconfigure</artifactId>
         <version>2.1.6.RELEASE</version>
     </dependency>
 <br/> Empty scope (either the client or the user is not allowed the requested scopes) - while requesting client
  credentials
  
     Provide a scope as a parameter to the URL : eg.?scope=cas_incorporator
     Refer the solution: https://stackoverflow.com/questions/53568766/spring-boot-oauth2-empty-scope-either-the-client-or-the-user-is-not-allowed-t
     