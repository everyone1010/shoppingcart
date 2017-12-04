package com.msn.poc.registry.serviceregistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication extends SpringBootServletInitializer{

	private static final Class<ServiceRegistryApplication> applicationClass = ServiceRegistryApplication.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);

	public static void main(String[] args) {
		log.debug("#### Service Registry ####");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("#### Service Registry ####");
		return application.sources(applicationClass);
	}
}
