package com.surya.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.surya.microservices.currencyconversionservice.bean.CurrencyConversionBean;

//application name of another microservice : currency-exchange-service
//@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000")
//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
//list urls in applications.prop
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	
//	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//routing through zuul
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveCurrencyExchange(@PathVariable("from") String from, @PathVariable("to") String to);
		

}
