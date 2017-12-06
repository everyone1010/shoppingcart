package com.msn.poc.tracing.zipkinserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
@ComponentScan(basePackages = "com.msn.poc.tracing")
public class ZipkinserverApplication extends SpringBootServletInitializer{

	private static final Class<ZipkinserverApplication> applicationClass = ZipkinserverApplication.class;
	private static final Logger log = LoggerFactory.getLogger(applicationClass);

	public static void main(String[] args) {
		log.debug("#### ZipkinserverApplication ####");
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("#### ZipkinserverApplication ####");
		return application.sources(applicationClass);
	}
}
