package com.agent.agent_Mservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AgentMserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgentMserviceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}

}
