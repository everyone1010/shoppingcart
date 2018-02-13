# CART "Microservice" using Spring Boot, Swagger and MySQL

This is a sample Java / Gradle Buildship 2x / Spring Boot (version 1.5.6) application demonstrating Microservices, JPA, Swagger with built-in health check, metrics using Spring Actuator.


## About the Service

The service is a simple cart microservice. Check swagger URL http://HOSTNAME:PORT/swagger-ui.html for API docs (port:8985). 


## About the other endpoints to manage and monitor the Spring Boot application

This application is integrated with Spring Actuator which gives the following endpoints helpful in monitoring and operating the service:

**/metrics** Shows metrics information for the current application.

**/health** Shows application health information.

**/info** Displays arbitrary application info.

**/configprops** Displays a collated list of all @ConfigurationProperties.

**/mappings** Displays a collated list of all @RequestMapping paths.

**/beans** Displays a complete list of all the Spring Beans in your application.

**/env** Exposes properties from Springs ConfigurableEnvironment.

**/trace** Displays trace information (by default the last few HTTP requests).

# Questions and Comments: shamsnezami@gmail.com

# Few useful links
https://piotrminkowski.wordpress.com/

https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/

https://piotrminkowski.wordpress.com/2017/04/05/part-2-creating-microservices-monitoring-with-spring-cloud-sleuth-elk-and-zipkin/

https://developer.okta.com/blog/2017/06/15/build-microservices-architecture-spring-boot

https://dzone.com/articles/microservice-architecture-with-spring-cloud-and-do




