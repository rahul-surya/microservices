package com.surya.microservices.currencyexchangeservice.service;

import com.surya.microservices.currencyexchangeservice.entity.ExchangeValue;

public interface ExchangeValueService {
	
	
	ExchangeValue getExchangeValue(String from, String to);

}
