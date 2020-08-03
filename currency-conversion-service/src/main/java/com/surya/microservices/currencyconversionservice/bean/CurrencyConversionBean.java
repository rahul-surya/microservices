package com.surya.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private int port;
	
	private BigDecimal quantity;
	private BigDecimal convertedAmount;
	
	
	
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionRate, int port,
			BigDecimal quantity, BigDecimal convertedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.port = port;
		this.quantity = quantity;
		this.convertedAmount = convertedAmount;
	}
	
	
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getConversionRate() {
		return conversionRate;
	}
	public int getPort() {
		return port;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}
	
	
	

}
