package com.lab1.beans;

import com.lab1.interfaces.ThousandsIterator;

public class Thousands extends AbstractThousandsIterator implements ThousandsIterator {
	private static final int THOUSANDS_VALUE = 1_000;
	private static final String THOUSANDS_STRING = "Thousand";

	@Override
	public int getThousandValue() {
		return THOUSANDS_VALUE;
	}

	@Override
	public String getThousandString() {
		return THOUSANDS_STRING;
	}

}
