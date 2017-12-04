# Config-server

This is a sample Java / Gradle Buildship 2x / Spring Boot (version 1.5.6) application demonstrating eureka service registry

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
* GET http://localhost:8983/
* GET http://localhost:8983/eureka/apps/cart 
* GET http://localhost:8983/eureka/apps/user

# Questions and Comments: shamsnezami@gmail.com






