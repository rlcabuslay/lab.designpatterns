package com.lab1;

import com.lab1.beans.Thousand;
import com.lab1.factory.ThousandsIteratorFactory;
import com.lab1.interfaces.ThousandsIterator;

public class NumberIterator {
	private ThousandsIterator billions;
	private ThousandsIterator millions;
	private ThousandsIterator thousands;
	
	public NumberIterator() {
		this.billions = ThousandsIteratorFactory.instance().getThousandsIterator(ThousandsType.BILLIONS);
		this.millions = ThousandsIteratorFactory.instance().getThousandsIterator(ThousandsType.MILLIONS);
		this.thousands = ThousandsIteratorFactory.instance().getThousandsIterator(ThousandsType.THOUSANDS);
		
		this.billions.chain(millions);
		this.millions.chain(thousands);
	}
	
	public void convertNumberToWords(int number) {
		if(number < 0 || number > 2147483647) {
			throw new IllegalArgumentException("Number must be within the range 0 to 2147483647");
		} else if (number == 0) {
			System.out.println(" Zero");
		}
		this.billions.iterate(new Thousand(number));
	}
}
