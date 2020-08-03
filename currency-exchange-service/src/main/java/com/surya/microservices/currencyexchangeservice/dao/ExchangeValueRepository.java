package com.surya.microservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.microservices.currencyexchangeservice.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	
	
	ExchangeValue findByFromAndTo(String from, String to);

}
