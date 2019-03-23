package com.techlabs.rectangle;

import java.lang.reflect.Array;

import com.techlabs.rectange.test.*;

public class RectangleTest {
	public static void main(String str[]) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();

		small.setHeight(120);
		small.setWidth(20);

		big.setHeight(0);
		big.setWidth(70);

		small.setColor("GreeN");
		big.setColor("black");
		Rectangle temp=big;

		getRectDetails(small);
		getRectDetails(big);
		getRectDetails(temp);
		temp=null;
		getRectDetails(big);

	}

	public static void getRectDetails(Rectangle rect) {
		System.out.println("Rectange 1\nWidth: " + rect.getWidth() + "\nHeight: " + rect.getHeight() + " \nArea: "
				+ rect.calculateArea() + "\nColor: " + rect.getColor() + "\nHash: " + rect.hashCode());

	}

}
