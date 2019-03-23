package com.techlabs.rectangle;

import com.techlabs.rectange.test.*;

public class RectangeTestArray {
	public static void main(String arg[]) {
		Rectangle[] arr=new Rectangle[3];
		for (Rectangle rectangle : arr) {
			rectangle=new Rectangle();
			rectangle.setColor("red");
			rectangle.setHeight(10);
			rectangle.setWidth(10);
			getRectDetails(rectangle);
		}
			
	}

	public static void getRectDetails(Rectangle rect) {
		System.out.println("Rectange 1\nWidth: " + rect.getWidth() + "\nHeight: " + rect.getHeight() + " \nArea: "
				+ rect.calculateArea() + "\nColor: " + rect.getColor() + "\nHash: " + rect.hashCode());

	}
}
