const springAnnotation = () => `
# Files Level Description
 - src/main/java        - java files to write the logic
 - src/main resources   - source file for java dependencies
 - src/main/test        - java test files suc as unit testing

# Spring Container
 - Spring container manages spring beans and their lifecycle. 
 - Spring container is of 2 types
    ~ Bean Factory - Basic Spring Container (Not mostly used)
    ~ Application Context - Advanced Spring container with enterprise-specific feature
         - Easy to use in web application.
         - Easy internationalization.
         - Easy integration with spring AOP.

# Spring Annotation
 - @Configuration - Configuration class contains all the bean that is managed by spring.
 - @Bean - Its the property or an object which is managed by spring internally.
     - Direct Beam creation
     - Indiret Beam creation - Using method / Using parameter
 - @Component - an annotation that allows Spring to detect our custom beans automatically.
 - @ComponentScan(packagename) - Need to tell spring to scan which package for component.
 - @Autowiring - process of wiring in dependencies for a spring bean.
 - @Lazy - Class and bean will only be initilized when its used.

# Important Terminology
 - Dependency Injection 
     ~ Identify beans, their dependencies and wire them together (Provide IOC- Inversion of control).
 - IOC Container
     ~ Manages the lifecycle of beans and dependencies.

# Java New Features
 - Record
   - Record is used to create class where we no need to write explisit getter setter and constructor.
   - It Will All be Managed by the spring beams.

# @Primary and @Qualifier
 - @Primary - A bean should be given preference when multiple candidates are qualified.
 - @Qualifier - A specific bean should be auto-wired(name of the bean can be used as qualifier).

# Dependency Injection
 - Constructor Based - @Autowired is used at constructor. // This one is automatic @autowired is not needed
 - Setter Based - @Autowired is used at setter function.
 - Field Based - @Autowired to used for property.  
`;

const springBoot = () => `
# Spring Boot
 - Spring Boot was introduced in 2016.
 - Spring Tools for Building Application Quickly
     Spring Initializr
     Spring Boot Starter Projects
     Spring Boot AutoConfiguration
     Spring Boot DevTools
 - Spring Tools for Production Ready Application
     Logging
     Different configuration for Different Enviourment
     Monitoring (Spring Boot Actuator)


# Spring Boot project Folder structure
 - src/main/java - where all main code is written
 - src/main/resouce - resource for project.
 - src/main/test - unit test cases.
 - pom.xml - Where all dependecies is placed.

# Application.property 
 - Configuration using multiple springframework logging level
      ~ trace
      ~ debug
      ~ info
      ~ warning
      ~ error
      ~ off 

# Activate profile for the other Enviourment
 - spring.profiles.active=prod;
 - Above thing will take all stuff from application-prod.properties

# Spring Boot Actuator
 - Actuator help in monitor and manage the application in production enviourment.
 - beans - Complete list of spring beans in your app
 - health - Application health information
 - metris - Application metrics
 - mappings - Details around request mapping
`;

const springBootDependency = () => `
# Deploy and develop application using JAR
 - Click on project and run as maven build
 - Goal write command as  [clean install]
 - Then go to the jar file run using java --jar [filename] 
 - Deployed using embedded server
      - tomcat
      - jetty
      - undertow

# Lambok
  <dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.16.18</version>
	</dependency>

# Spring DevTools
  <dependency>
    <groupId>org.springframework.boot</groupId>
	  <artifactId>spring-boot-devtools</artifactId>
	</dependency>  

# Spring Actuator
  <dependency>
    <groupId>org.springframework.boot</groupId>
	  <artifactId>spring-boot-starter-actuator</artifactId>
	</dependency>  
  - if want to get all end point put this in properties
  management.endpoints.web.exposure.include=*
`;

const springJpa = () => `
# Create the table using below functionality
 - Spring JDBC
 - JPA and Hibernate
 - Spring Data JPA
`;

const exportData = {
  "Spring Annotation": springAnnotation,
  "Spring Boot": springBoot,
  "Sprig Boot Dependency": springBootDependency,
  "Spring JPA and Hibernate": springJpa,
};
