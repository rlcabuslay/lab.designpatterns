package com.lab2.factory;

import com.lab2.TicketEnum;
import com.lab2.beans.AdultsTicketCategory;
import com.lab2.beans.ChildrenTicketCategory;
import com.lab2.beans.SeniorsTicketCategory;
import com.lab2.interfaces.TicketCategory;

public class TicketFactory {
	private static TicketFactory INSTANCE;

    private TicketFactory() {
    	
    }

    public static TicketFactory instance() {
        if (INSTANCE == null) {
            INSTANCE = new TicketFactory();
        }
        
        return INSTANCE;
    }

    public TicketCategory getCashDispenser(TicketEnum type, float tax) {
        TicketCategory ticketCategory = null;
        
        switch (type) {
            case CHILDREN:
            	ticketCategory = new ChildrenTicketCategory();
                break;
            case ADULTS:
                ticketCategory = new AdultsTicketCategory();
                break;
            case SENIORS:
            	ticketCategory = new SeniorsTicketCategory();
                break;
                
        }
        
        ticketCategory.setTax(tax);
        
        return ticketCategory;
        
    }
}
