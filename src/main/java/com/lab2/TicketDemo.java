package com.lab2;

import com.lab2.beans.TicketCart;
import com.lab2.factory.TicketFactory;
import com.lab2.interfaces.TicketCategory;

public class TicketDemo {

	public static void main(String[] args) {
		TicketCart ticketCart = new TicketCart();
		
		float taxPercentage = 0.5F;
		
		TicketCategory childTicket = TicketFactory.instance().getCashDispenser(TicketEnum.CHILDREN, taxPercentage);
		TicketCategory adultTicket = TicketFactory.instance().getCashDispenser(TicketEnum.ADULTS, taxPercentage);
		TicketCategory seniorTicket = TicketFactory.instance().getCashDispenser(TicketEnum.SENIORS, taxPercentage);
		
		ticketCart.addTicket(childTicket);
		ticketCart.addTicket(adultTicket);
		ticketCart.addTicket(seniorTicket);
		
		for(TicketCategory ticket : ticketCart.getTickets()) {
			System.out.println(String.format("Ticket Type: %s, Ticket Price: %s", ticket.getTicketType(), ticket.getTotalPrice()));
		}
		
		System.out.println(String.format("Total Price: %s", ticketCart.getTotalAmount()));
	}

}
