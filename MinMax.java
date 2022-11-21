package com.bridgelabz;

public class MinMax {

	public static void main(String args[]) {

		int a = 10;
		int b = 20;
		int c = 30;
		int result;

		System.out.println("a is " + a + " and b is " + b);

		result = a + b * c;
		System.out.println("result of first operation=" + result);

		result = c + a / b;
		System.out.println("result of second operation=" + result);

		result = a % b + c;
		System.out.println("result of third operation=" + result);

		result = a * b + c;
		System.out.println("result of fourth operation=" + result);
		System.out.println("Maximun number=" + Math.max(a, b));
		System.out.println("Minimum number=" + Math.min(a, b));

	}

}
