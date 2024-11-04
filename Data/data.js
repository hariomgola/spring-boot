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

# Java New Features
 - Record
   - Record is used to create class where we no need to write explisit getter setter and constructor.
   - It Will All be Managed by the spring beams.

# @Primary and @Qualifier
 - @Primary - When we have more than 2 beam of same class and type for chossing one we have to use primary.

`;

const exportData = {
  "Spring Annotation": springAnnotation,
};
