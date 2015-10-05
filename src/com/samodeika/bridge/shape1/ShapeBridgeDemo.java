package com.samodeika.bridge.shape1;

public class ShapeBridgeDemo {

	public static void main(String[] args) {

		Circle circle = new BlueCircle();
		
		Square square = new RedSquare();
		
		circle.applyColor();
		square.applyColor();
		
	}

}
