package com.techlabs.evenodd;

public class EvenOdd {
	private int numbersRange;

	public void setNumbersRange(int number) {
		this.numbersRange = number;
	}

	public void printEvenNumber() {
		System.out.println("Even Numbers:");
		for (int number = 1; number <= numbersRange; number++) {
			if ((number % 2) == 0) {
				System.out.println(number);
			}
		}
	}

	public void printOddNumber() {
		System.out.println("Odd Numbers:");
		for (int number = 1; number <= numbersRange; number++) {
			if ((number % 2) != 0) {
				System.out.println(number);
			}
		}
	}
}
