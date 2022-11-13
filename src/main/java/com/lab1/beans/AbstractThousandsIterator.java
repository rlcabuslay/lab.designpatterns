package com.lab1.beans;

import com.lab1.interfaces.ThousandsIterator;
import static com.lab1.utils.IterateAndConvertHundreds.*;

public abstract class AbstractThousandsIterator {
	private ThousandsIterator thousandsIterator;

    public void chain(ThousandsIterator thousandsIterator) {
        this.thousandsIterator = thousandsIterator;
    }

    public void iterate(Thousand thousand) {
        final int number = thousand.getNumber();
        if (number >= getThousandValue()) {
            final int numberOfThousands = number / getThousandValue();
            final int remainingNumber = number % getThousandValue();
            
            System.out.print(String.format("%s %s", convertHundreds(numberOfThousands), getThousandString()));
            
            iterateNumber(thousandsIterator, new Thousand(remainingNumber), remainingNumber);

            
        } else {
        	iterateNumber(thousandsIterator, thousand, number);
        	
        }

    }

    public abstract int getThousandValue();
    
    public abstract String getThousandString();
    
}
