package com.techlabs.rectangle;

import com.techlabs.rectange.test.*;

public class RectangleTest {
	public static void main(String str[]) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		small.height = 10;
		small.width = 20;
		big.height = 50;
		big.width = 70;
		System.out
				.println("Rectange 1\nWidth: " + small.width + "\nHeight: " 
		+ small.height + " \nArea: " + small.calculateArea());
		System.out.println("Rectange 2\nWidth: " + big.width + "\nHeight: "
		+ big.height + "\nArea: " + big.calculateArea());
	}
}
