package com.lab3.factory;

import com.lab3.shape.Circle;
import com.lab3.shape.Rectangle;
import com.lab3.shape.Shape;
import com.lab3.shape.Square;

public class ShapeFactory {
	private static ShapeFactory INSTANCE;

    public static ShapeFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShapeFactory();
            
        }
        
        return INSTANCE;
        
    }

    private ShapeFactory() {
    	
    }

    public Shape getShape(ShapeType type) {
        Shape shape = null;
        
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        
        return shape;
        
    }
}
