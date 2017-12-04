# Config-server

This is a sample Java / Gradle Buildship 2x / Spring Boot (version 1.5.6) application demonstrating config client

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

Service registry endpoint is as below,
* GET http://localhost:8984/routes
* Now one can call GET http://localhost:8984/user/v1/getcart (API Gateway) instead of http://localhost:8986/v1/getcart (directly)

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






