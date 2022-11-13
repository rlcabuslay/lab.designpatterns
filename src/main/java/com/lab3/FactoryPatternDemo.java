package com.lab3;

import com.lab3.factory.ShapeFactory;
import com.lab3.factory.ShapeType;
import com.lab3.shape.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.newInstance();
		
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
        
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();
	}

}
