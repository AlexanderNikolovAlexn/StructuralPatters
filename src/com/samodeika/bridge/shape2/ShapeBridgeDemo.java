package com.samodeika.bridge.shape2;

public class ShapeBridgeDemo {

	public static void main(String[] args) {

		Color blue = new Blue();
		Color red = new Red();
		Color green = new Green();
		
		Shape circle = new Circle(red);
		
		Shape square = new Square(blue);
		
		Shape greenCircle = new Circle(green);
		
		Shape greenSquare = new Circle(green);
		
		circle.applyColor();
		square.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
		
	}

}
