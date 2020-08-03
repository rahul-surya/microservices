package com.surya.microservices.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.microservices.currencyexchangeservice.dao.ExchangeValueRepository;
import com.surya.microservices.currencyexchangeservice.entity.ExchangeValue;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

	@Autowired
	ExchangeValueRepository exchangeValueRepository;
	
	@Override
	public ExchangeValue getExchangeValue(String from, String to) {

		return exchangeValueRepository.findByFromAndTo(from, to);
	}

}
