package com.bridgelabz;

import java.util.Scanner;

public class Qudratic {
	static void roots(int a, int b, int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}

	/**
	 * Main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s.nextInt();
		System.out.println("enter b");
		int b = s.nextInt();
		System.out.println("enter c");
		int c = s.nextInt();
		roots(a, b, c);

	}
}