package com.msn.poc.config.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
public class ConfigClientApplication extends SpringBootServletInitializer{

	private static final Class<ConfigClientApplication> applicationClass = ConfigClientApplication.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);

	public static void main(String[] args) {
		log.debug("#### Config Client ####");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("#### Config Client ####");
		return application.sources(applicationClass);
	}
}
