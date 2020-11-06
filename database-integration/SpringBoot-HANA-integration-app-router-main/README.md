# SpringBoot-HANA-integration-app-router
SpringBoot application with HANA integration, app-router to restrict access to app URL with XSUAA

<br/>Tutorial followed to create the cloud application with hana integration: https://blogs.sap.com/2019/07/22/develop-a-spring-boot-java-application-with-hana-database-on-sap-cloud-platform-cloud-foundry-part-1/
<br/>Some changes needs to be done in ClodDatabaseConfig class refer the source code
<br/>While generating war file inorder to skip the test cases either provide the folloing code in pom.xml properties section:
<br/><maven.test.skip>true</maven.test.skip>
<br/>or provide the following flag while doing mvn clean install:
<br/>-DskipTests

<br/>Tutorial followed for creating the app-router: http://www.sapspot.com/create-rest-apis-secured-with-xsuaa-in-cloud-foundry-environment-and-call-rest-apis-in-abap-environment/
<br/>This does not provide api based access it only provides url restrictive access (Can be used with UI applications)
