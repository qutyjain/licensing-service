package com.books.registrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
class Application {

	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
