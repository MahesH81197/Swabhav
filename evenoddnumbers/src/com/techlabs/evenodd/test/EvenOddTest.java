package com.techlabs.evenodd.test;

import com.techlabs.evenodd.*;

public class EvenOddTest {
	public static void main(String args[]) {
		EvenOdd number = new EvenOdd();
		number.setNumbersRange(100);
		number.printEvenNumber();
		number.printOddNumber();
	}
}
