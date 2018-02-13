# CART "Microservice" using Spring Boot, Swagger and MySQL

This is a sample Java / Gradle Buildship 2x / Spring Boot (version 1.5.6) application demonstrating Microservices, Swagger with built-in health check, metrics using Spring Actuator and service to service call without knowing IP/PORT using Ribbon/Feign(commented out). Hystrix circuitbreaker, fallback and bulkhead used for resilience (Hystrix dashboard integrated). Sleuth and Zipkin is also integrated.

## About the Service

The service is a simple cart microservice. Check swagger URL http://HOSTNAME:PORT/swagger-ui.html for API docs (port:8987).



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

## Hystrix dashboard
http://IP:PORT/hystrix
Type http://localhost:8987/hystrix.stream, 5000, USER and click monitor stream to view the dashboard

## Zipkin dashboard
http://localhost:8985 (of Zipkin server)

# Questions and Comments: shamsnezami@gmail.com






