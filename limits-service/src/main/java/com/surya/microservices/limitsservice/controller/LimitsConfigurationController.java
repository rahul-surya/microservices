package com.surya.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.surya.microservices.limitsservice.Configuration;
import com.surya.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations(){
		
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
	
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallbaclRetrieveConfigurations")
	public LimitConfiguration retrieveConfigurations(){
		
		throw new RuntimeException("not available");
	}
	
	
	public LimitConfiguration fallbaclRetrieveConfigurations() {
		
		return new LimitConfiguration(9,999);
	}

}
