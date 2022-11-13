package com.lab2.interfaces;

import java.math.BigDecimal;

public interface TicketCategory {
	void setTax(float tax);
	String setTicketType();
	String getTicketType();
	BigDecimal setTicketPrice();
	BigDecimal getTicketPrice();
	BigDecimal getTotalPrice();
}
