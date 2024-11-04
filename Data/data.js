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

const exportData = {
  "Spring Annotation": springAnnotation,
};
