package com.lab2.beans;

import java.math.BigDecimal;

import com.lab2.interfaces.TicketCategory;

public class ChildrenTicketCategory extends AbstractTicketCategory implements TicketCategory{
	private static final int CHILDREN_PRICE = 10;

	@Override
	public BigDecimal setTicketPrice() {
		return new BigDecimal(CHILDREN_PRICE);
		
	}

	@Override
	public String setTicketType() {
		return "Children";
	}
	
}
