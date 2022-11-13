package com.lab1.utils;

import com.lab1.beans.Thousand;
import com.lab1.interfaces.ThousandsIterator;

public class IterateAndConvertHundreds {
	private static final String[] belowTwenty = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven",
			" Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen",
			" Seventeen", " Eighteen", " Nineteen" };

	private static final String[] tens = { "", " Ten", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy",
			" Eighty", " Ninety" };
	
	public static void iterateNumber(ThousandsIterator thousandsIterator, Thousand thousand, int number) {
		if(number >= 1000) {
        	thousandsIterator.iterate(thousand);
        	
        } else {
        	System.out.println(String.format("%s", convertHundreds(number)));
            
        }
	}

	public static String convertHundreds(int num) {
		String trail;

		int indexOfTwoDigits = num % 100;

		if (indexOfTwoDigits < 20) {
			trail = belowTwenty[indexOfTwoDigits];
			num = num / 100;
		} else {
			trail = belowTwenty[num % 10];
			num = num / 10;

			trail = tens[num % 10] + trail;
			num = num / 10;
		}

		if (num == 0) {
			return trail;
		} else {
			return belowTwenty[num] + " Hundred" + trail;
		}
	}
}
