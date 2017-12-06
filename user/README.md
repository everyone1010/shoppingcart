# CART "Microservice" using Spring Boot, Swagger and MySQL

This is a sample Java / Gradle Buildship 2x / Spring Boot (version 1.5.6) application demonstrating Microservices, JPA, Swagger with built-in health check, metrics using Spring Actuator and service to service call without knowing IP/PORT using Ribbon/Feign(commented out). Hystrix circuitbreaker, fallback and bulkhead used for resilience (Hystrix dashboard integrated). Sleuth and Zipkin is alo integrated.

## How to Run 
* Clone this repository 
* Make sure you are using JDK 1.8 and Gradle 3.x
* Once successfully built, you can run the service as mentioned below:
```
       gradle bootRun
```
* Check the stdout to make sure no exceptions are thrown

Once the application runs you should see something like this

```
Started *Application in 12.87 seconds (JVM running for 13.83)
```

## About the Service

The service is a simple cart microservice. Check swagger URL http://HOSTNAME:PORT/swagger-ui.html for API docs (port:8986).
* POST /v1/add/{cartid} Adds item to the provided cartid else creates a new cartid and adds item to it.
* DELETE /v1/clear/{cartid} Removes all items from the provided cartid.
* DELETE /v1/clearall Remove all the carts.
* GET /v1/getall Get all the cartid's.
* DELETE /v1/remove/{cartid} Removes the item from the provided cartid.
* GET /v1/retrieve/{cartid} Retrieves the contents of the provided cartid.
* PUT /v1/update/{cartid} Update the item quantity and price for the provided cartid.

You can use this sample service to understand the conventions and configurations that allow you to create a MicroService. 
 
Here is what this little application demonstrates: 

* Full integration with the latest **Spring** Framework: inversion of control, dependency injection, etc.
* Demonstrates how to set up healthcheck, metrics, info, environment, etc. endpoints automatically on a configured port. Inject your own health / metrics info with a few lines of code.
* Writing a RESTful service using annotation: supports JSON request / response; simply use desired ``Accept`` header in your request
* Exception mapping from application exceptions to the right HTTP response with exception details in the body
* Demonstrates MockMVC test framework with associated libraries
* All APIs are "self-documented" by Swagger2 using annotations 


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
Type http://IP:PORT/hystrix.stream, 5000, USER and click monitor stream to view the dashboard

## Zipkin dashboard
http://IP&PORT(of Zipkin server)

# Questions and Comments: shamsnezami@gmail.com






