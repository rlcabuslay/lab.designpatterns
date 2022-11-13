package com.lab1.factory;

import com.lab1.ThousandsType;
import com.lab1.beans.Billions;
import com.lab1.beans.Millions;
import com.lab1.beans.Thousands;
import com.lab1.interfaces.ThousandsIterator;

public class ThousandsIteratorFactory {
    private static ThousandsIteratorFactory INSTANCE;

    private ThousandsIteratorFactory() {
    }

    public static ThousandsIteratorFactory instance() {
        if (INSTANCE == null) {
            INSTANCE = new ThousandsIteratorFactory();
        }
        return INSTANCE;
    }

    public ThousandsIterator getThousandsIterator(ThousandsType type) {
    	ThousandsIterator thousandsIterator = null;
        switch (type) {
            case BILLIONS:
                thousandsIterator = new Billions();
                break;
            case MILLIONS:
                thousandsIterator = new Millions();
                break;
            case THOUSANDS:
                thousandsIterator = new Thousands();
                break;
        }
        return thousandsIterator;
    }
}
