/**
# Learning Curve 
 - Tight Coupling
 - Loose Coupling
 - Dependency Injection
 - Spring Beans
 - Application Context
 - IOC container
 - Auto Wiring
 - Component Scan

# Learning Iteration
  - Iteration 1 - Tight coupling plain Java code
  - Iteration 2 - Loose coupling interface
  - Iteration 3 - Loose Coupling - Spring framework 1 (Spring bean, framework to manage object and class)
  - Iteration 4 - Loose Coupling - Spring framework 2 (Spring Annotation, spring create manage and autowired objects)

-------------------------------------------------------------------------------------------------------------------------

# create a spring project
 - https://start.spring.io/
 - using maven as project and java as language

# notes 
 - Interface allow us to map and define the function for the class
 - JVM>Spring - We are putting spring framework to create the object and wire for us

# Spring Container (Spring context)
 - Spring container: Manages Spring beams and their lifecycle.
 - 2 types fof containers
      1: Bean Factory: Basic Spring Container
      2: Application Context: Advance Spring Container with enterprise-specific feature
             - Easy to use in web application
             - Easy internationalization
             - Easy integration with spring AOCxc

# Difference B/w java bean vs POJO vs Spring Bean
 - POJO stands for plain old java object its simply like a class in java
 - Java bean 
           - EJP use this concept which is no longer used
           - it has no argument constructor. 
           - It should have getters  and setters.
           - It should have serializer.
 - Spream beam
           - Anything which is maintained by springs
           - Anything managed by ioc container like @configuration


# Files Level Description
 - src/main/java        - java files to write the logic
 - src/main resources   - source file for java dependencies
 - src/main/test        - java test files suc as unit testing

# Iteration 1: Tightly Couples
  - Game Runner class
  - Game classes: mario, supercontra

# Iteration 2: Loose Coupling - Interface
  - Game Runner classs
  - Game inteface: mario, supercontra

# Iteration 3: Loose Coupling - spring Level 1
  -  @configuration means this is the configuration class and that need to be imported as well
  - The things which are manage by spring are tearmed as spring beams

# Notes - IMP
 - Get list of all beams which is manged by spring framework
 // get list of all the beams that will be managed by spring
		Arrays.stream(context.getBeanDefinitionNames())
		  .forEach(System.out::println);

  - When Multiple bean is present we need to make one bean as primary
    @Bean
	  @Primary
	  public Person person2() {
		  return new Person(name(),age());
	  }
  - If want to internally set the priority to use the bean
  
# Spring Notes
@primary - When we need to do the primary  bean or defined the priority for same
@Qualifier - When we need to do the qualifier for the neam we are using this

# Dependency Injection
 - Constructor Based - Dependencies are set by creating the bean using its constructor
 - Setter-based - Dependencies are set by calling setter menthords on your beans
 - Field - No setter or constructor dependencies is injected using reflection (@Autowired)

# Notes
 - @Component (..) - An instance of class will be managed by spring framework
 - @ComponentScan(..) - spring need to component class using component scan
 - Dependency injection - Identify bean, their dependencies and wire then together(Provide IOC- Inversion of control)


# Lazy Initialization of spring Beam
 - @Lazy is used to load the beam when we are using that it will not be directly loaded into the application load

-------------------------------------------------------------------------------------------------------------------------
# Maven (Apache Maven)
 - Apache maven is the project mangment tool that help us to create, build and manage dependencies and test case.

# Spring Boot
 - Spring boot was released in 2016

# Life before Spring Boot
 - When creating the rest api we need spring framework, Spring mvc framework, JSON binding framerwork etc.
 - We need to manage frame work and the versioning of these frame work and compatibility for same.

# Advantage of Using Spring Boot
 - Quickly 
     - Spring Initializr
     - Spring Boot starter project
     - Spring Boot Auto configuration
     - Spring Boot DevTools
     - Actuator

  - Production-Ready
     - Logging 
     - Configuration for different enviourment.
     - Monitoring (Spring Boot Actuator)

# Important Annotation
 - @RestController
      - Need to be put outside the class where the handler need to be exposed.

 - @RequestMapping
      - Need to put outside the function along with the handler name.
      - @RequestMapping("/courses")

 - Want to make the changes to application property
    source/main/resources - application

# Spring Boot auto configuration
 - Web Application and Rest API - Spring boot starter project
 - Unit testing - Spring Boot starter test
 - Talk to database using JPA - Spring Boot starter data JPA
 - Talk to database using JDBC - Spring Boot starter JDBC
 - Secure your web application or REST API - Spring Boot starter security

# Spring Boot DevTools
 - To use the spring dev tools we need to put articatId in pom.xml as spring-boot-devtools
 - It help us to automatically restart the application automatically without loading and re-loading again.
 - IF any changes is made in pom.xml or dependencies change we need to start the application manulally
      ________________________________________________
     |                                                |
     |<dependency>                                    |
     |  <groupId>org.springframework.boot</groupId>   |
	|  <artifactId>spring-boot-devtools</artifactId> |
	|</dependency>                                   |
     |________________________________________________|

# Spring Configuration for production ready application
 - Porfiles 
      - Profiles has been used to configure different enviourments
      - If anyting we want to used at different env level such as dev int prod.
 - Configuration Property
      - Configuration property allow us to configutre the property and used it in java or spring boot code
 - Embedded Servers
      - Install java and run jar serve will be up and running
      - Right click on project and click on run as > maven build
      - Goals - Write "clean install"
      - clean install will run the command mvm clean install
      - Copy the jar location and goto that and run below command.
      - Command - java -jar file_Name
  - Actuator
      - It help to monitor and manage the application in production.
      - Provides the number of end-points
          - Beans - Complete list of spring beans in your app
          - health - Application health information
          - metrics - Application metrics
          - mappings - details around reuqest mappings
      - To enable all the end points provided by actuator write below command in property file
          - management.endpoints.web.exposure.include=*
          -  management.endpoints.web.exposure.include=health,matrics
      
# Application.property 
 - Configuration using multiple springframework logging level
        - trace
        - debug
        - info
        - warning
        - error
        - off 

# Spring Hibernate and JPA
 - Dependencies
    - Spring Web
    - Spring Data JDBC
    - Spring Data JPA
    - H2 Database

 - Notes 
   - To Enable the h2 console write the below mentioned command in application properties
        spring.h2.console.enable=true
   - To Provide the constant url for h2 in every run provide below command
        jdbc:h2:mem:testdb 

# Spring JDBC
 - Difference b/w JDBC and Spring JDBC is that we are writting very less code to connect and execute in swl server form java
 - @Repository - This will talk to the data base need to be put outside the class


 - @Entity - IF we want to make the java class same as sql column and rows we need to create this handler





























 */
