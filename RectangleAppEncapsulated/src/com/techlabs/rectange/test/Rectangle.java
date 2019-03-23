package com.techlabs.rectange.test;

public class Rectangle {
	private int height;
	private int width;
	private String color;

	public String getColor() {
		return color;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = validateRange(height);
	}

	public void setWidth(int width) {
		this.width = validateRange(width);
	}

	public void setColor(String color) {
		this.color = validateColor(color);
	}

	public float calculateArea() {
		return height * width;
	}

	private int validateRange(int num) {
		if (num < 1)
			return 1;
		else if (num > 100)
			return 100;
		else
			return num;
	}

	private String validateColor(String clr) {
		if (clr.equalsIgnoreCase("red") || clr.equalsIgnoreCase("green") || clr.equalsIgnoreCase("blue"))
			return clr;
		return "red";
	}

}
