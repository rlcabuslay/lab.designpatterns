package com.lab2.beans;

import java.math.BigDecimal;

import com.lab2.interfaces.TicketCategory;

public class AdultsTicketCategory extends AbstractTicketCategory implements TicketCategory{
	private static final int ADULTS_PRICE = 15;

	@Override
	public BigDecimal setTicketPrice() {
		return new BigDecimal(ADULTS_PRICE);
		
	}

	@Override
	public String setTicketType() {
		return "Adults";
	}
	
}
