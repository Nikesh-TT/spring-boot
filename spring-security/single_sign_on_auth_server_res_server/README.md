<<<<<<< HEAD
# single-sign-on-oauth2 Authorization Server and the Resource Server
<br> Authorization Server and the Resource Server together here, as a single deployable unit
<br/> Fix for the issue java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException

     Clean solution for all JDKs >= 9
     You need to add two dependencies to your build
     
     the jaxb-api
     a jaxb implementation
     As an implementation I chose to use the reference implementation by glassfish to get rid of old com.sun classes / libraries. So as a result I added in my maven build
     
     <dependency>
       <groupId>javax.xml.bind</groupId>
       <artifactId>jaxb-api</artifactId>
       <version>2.3.1</version>
     </dependency>
     
     <dependency>
       <groupId>org.glassfish.jaxb</groupId>
       <artifactId>jaxb-runtime</artifactId>
       <version>2.3.1</version>
     </dependency>
     Note that from version 2.3.1 you don't need to add the javax.activation any longer. (see https://github.com/eclipse-ee4j/jaxb-ri/issues/1222)
 
=======

NOTE: If you get an error about JAXB (java.lang.ClassNotFoundException: javax.xml.bind.JAXBException), it’s because you’re using Java 11. To fix this, add JAXB to your build.gradle.
runtimeOnly 'org.glassfish.jaxb:jaxb-runtime'
>>>>>>> 77e5ffd08700776216b3b6cce51ecb73bb09c535
