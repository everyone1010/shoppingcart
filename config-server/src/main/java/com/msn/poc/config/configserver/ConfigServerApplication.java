package com.msn.poc.config.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication extends SpringBootServletInitializer{

	private static final Class<ConfigServerApplication> applicationClass = ConfigServerApplication.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);

	public static void main(String[] args) {
		log.debug("#### Config Server ####");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("#### Config Server ####");
		return application.sources(applicationClass);
	}
}
