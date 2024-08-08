/**

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

# Spring Boot
 - Spring boot was released in 2016

# Advantage of Using Spring Boot
 - Quickly 
     - Spring Initializr
     - Spring Boot starter project
     - Spring Boot Auto configuration
     - Spring Boot DevTools

  - Production-Ready
     - Logging 
     - Configuration for different enviourment.
     - Monitoring (Spring Boot Actuator)

# Spring Boot DevTools
 - To use the spring dev tools we need to put articatId in pom.xml as spring-boot-devtools
 - It help us to automatically restart the application automatically without loading and re-loading again.
 - IF any changes is made in pom.xml or dependencies change we need to start the application manulally

# Spring Configuration
 - Porfiles has been used to configure different enviourments

# Application.property 
 - Configuration using multiple springframework logging level
        - trace
        - debug
        - info
        - warning
        - error
        - off 
































 */