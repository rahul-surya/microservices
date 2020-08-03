package com.surya.microservices.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.surya.microservices.currencyexchangeservice.entity.ExchangeValue;
import com.surya.microservices.currencyexchangeservice.service.ExchangeValueService;

@RestController
public class CurrencyExchangeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	ExchangeValueService exchangeValueService;
	
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveCurrencyExchange(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue = exchangeValueService.getExchangeValue(from, to);
		
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		LOGGER.info("ExchangeValue: {}",exchangeValue);
		
		return exchangeValue;
		
	}
	
	
	
	

}
