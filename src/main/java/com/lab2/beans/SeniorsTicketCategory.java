package com.lab2.beans;

import java.math.BigDecimal;

import com.lab2.interfaces.TicketCategory;

public class SeniorsTicketCategory extends AbstractTicketCategory implements TicketCategory{
	private static final int SENIORS_PRICE = 12;

	@Override
	public BigDecimal setTicketPrice() {
		return new BigDecimal(SENIORS_PRICE);
		
	}

	@Override
	public String setTicketType() {
		return "Seniors";
	}
	
}
