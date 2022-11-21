package com.bridgelabz;

public class SumOfNatural {
	public static void main(String args[]) {
		/*
		 * Declaring the variable and initializing the variables
		 */
		int number = 10;
		int sum = 0;
		/*
		 * Checking the condition by using for loop
		 */
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}