# SpringBoot-HANA-integration-app-router
SpringBoot application with HANA integration, app-router to restrict access to app URL with XSUAA

<br/> Tutorial followed to create the cloud application with hana integration: https://blogs.sap.com/2019/07/22/develop-a-spring-boot-java-application-with-hana-database-on-sap-cloud-platform-cloud-foundry-part-1/
<br/> Some changes needs to be done in ClodDatabaseConfig class refer the source code
<br/> While generating war file inorder to skip the test cases either provide the folloing code in pom.xml properties section:
<br/> `<maven.test.skip>true</maven.test.skip>`
<br/> or provide the following flag while doing mvn clean install:
<br/> -DskipTests

<br/> Tutorial followed for creating the app-router: http://www.sapspot.com/create-rest-apis-secured-with-xsuaa-in-cloud-foundry-environment-and-call-rest-apis-in-abap-environment/
<br/> This does not provide api based access it only provides url restrictive access (Can be used with UI applications)
<br> no identifier specified for entity
<br>	javax.persistence.Id should be used instead of org.springframework.data.annotation.Id. For anyone who encountered this issue, you can check if you imported the right Id class
<br>	How does spring.jpa.hibernate.ddl-auto property exactly work in Spring?

	For the record, the spring.jpa.hibernate.ddl-auto property is Spring Data JPA specific and is their way to specify a value that will eventually be passed to Hibernate under the property it knows, hibernate.hbm2ddl.auto.
	The values create, create-drop, validate, and update basically influence how the schema tool management will manipulate the database schema at startup.

	For example, the update operation will query the JDBC driver's API to get the database metadata and then Hibernate compares the object model it creates based on reading your annotated classes or HBM XML mappings and will attempt to adjust the schema on-the-fly.

	The update operation for example will attempt to add new columns, constraints, etc but will never remove a column or constraint that may have existed previously but no longer does as part of the object model from a prior run.

	Typically in test case scenarios, you'll likely use create-drop so that you create your schema, your test case adds some mock data, you run your tests, and then during the test case cleanup, the schema objects are dropped, leaving an empty database.

	In development, it's often common to see developers use update to automatically modify the schema to add new additions upon restart. But again understand, this does not remove a column or constraint that may exist from previous executions that is no longer necessary.

	In production, it's often highly recommended you use none or simply don't specify this property. That is because it's common practice for DBAs to review migration scripts for database changes, particularly if your database is shared across multiple services and applications.
