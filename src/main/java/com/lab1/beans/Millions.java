package com.lab1.beans;

import com.lab1.interfaces.ThousandsIterator;

public class Millions extends AbstractThousandsIterator implements ThousandsIterator {
	private static final int MILLIONS_VALUE = 1_000_000;
	private static final String MILLIONS_STRING = "Million";

	@Override
	public int getThousandValue() {
		return MILLIONS_VALUE;
	}

	@Override
	public String getThousandString() {
		return MILLIONS_STRING;
	}

}
