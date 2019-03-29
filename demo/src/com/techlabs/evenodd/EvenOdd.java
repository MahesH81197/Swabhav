package com.techlabs.evenodd;

public class EvenOdd {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void getEvenNumber() {
		System.out.println("Even Numbers:");
		for (int i = 1; i <= number; i++) {
			if ((i % 2) == 0) {
				System.out.println(i);
			}
		}
	}

	public void getOddNumber() {
		System.out.println("Odd Numbers:");
		for (int i = 1; i <= number; i++) {
			if ((i % 2) != 0) {
				System.out.println(i);
			}
		}
	}
}
