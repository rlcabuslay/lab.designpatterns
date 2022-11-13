package com.lab1.beans;

import com.lab1.interfaces.ThousandsIterator;

public class Billions extends AbstractThousandsIterator implements ThousandsIterator {
	private static final int BILLIONS_VALUE = 1_000_000_000;
	private static final String BILLIONS_STRING = "Billion";

	@Override
	public int getThousandValue() {
		return BILLIONS_VALUE;
	}

	@Override
	public String getThousandString() {
		return BILLIONS_STRING;
	}

}
