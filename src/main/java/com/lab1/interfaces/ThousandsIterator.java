package com.lab1.interfaces;

import com.lab1.beans.Thousand;

public interface ThousandsIterator {
	void chain(ThousandsIterator thousandsIterator);
	void iterate(Thousand thousand);
}
