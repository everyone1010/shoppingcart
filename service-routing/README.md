## About the Service

Service registry endpoint is as below,
* GET http://localhost:8984/routes
* Now one can call GET http://localhost:8984/user/v1/getcart (API Gateway) instead of http://localhost:8987/v1/getcart (directly)

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






