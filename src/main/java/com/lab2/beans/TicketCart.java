package com.lab2.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.lab2.interfaces.TicketCategory;

public class TicketCart {
	private List<TicketCategory> tickets;

    public TicketCart() {
        tickets = new ArrayList<>();
    }

    public void addTicket(TicketCategory ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket cannot be null.");
        }
        this.tickets.add(ticket);
    }

    public BigDecimal getTotalAmount() {
        BigDecimal totalAmount = new BigDecimal(0);
        for (TicketCategory ticket : tickets) {
            totalAmount = totalAmount.add(ticket.getTotalPrice());
        }
        return totalAmount;
    }
    
    public List<TicketCategory> getTickets() {
    	return tickets;
    }
}
