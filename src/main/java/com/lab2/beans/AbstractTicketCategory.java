package com.lab2.beans;

import java.math.BigDecimal;

public abstract class AbstractTicketCategory {
	private BigDecimal price;
	private BigDecimal tax;
	private String type;
	
	public AbstractTicketCategory() {
		this.price = setTicketPrice();
		this.type = setTicketType();
	}
	
	public void setTax(float tax) {
		this.tax = new BigDecimal(tax);
	}
	
	public BigDecimal getTotalPrice() {
		return this.price.add(this.tax);
	}
	
	public abstract BigDecimal setTicketPrice();
	
	public BigDecimal getTicketPrice() {
		return this.price;
	}
	
	public abstract String setTicketType();
	
	public String getTicketType() {
		return this.type;
	}
	
}
