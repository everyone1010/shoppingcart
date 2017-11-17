package com.msn.poc.cart.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties // no prefix, find root level values.
public class GlobalProperties {

	private static final Class<GlobalProperties> clasz = GlobalProperties.class;

}
