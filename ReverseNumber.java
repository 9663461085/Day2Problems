package com.bridgelabz;

public class ReverseNumber {
	public static void main(String args[]) {
		/*
		 * Declaring the variables and initializing the variables.
		 */
		int number = 1234;
		int reminder;
		int reverse = 0;
		/*
		 * Checking the condition by using while loop.
		 */
		while (number > 0) {
			reminder = number % 10;
			reverse = (reverse * 10) + reminder;
			number = number / 10;
		}
		System.out.println(reverse);
	}

}
