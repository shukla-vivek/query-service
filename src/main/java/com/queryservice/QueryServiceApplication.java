package com.queryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class QueryServiceApplication {

	static {
		//This is a mandatory property to set, else handshake won't work
		System.setProperty("com.couchbase.certAuthEnabled", "true");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(QueryServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
