package com.bridgelabz;

import java.util.Scanner;

public class MonthAndDay {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = scan.nextInt();
		System.out.println("Enter the day");
		int day = scan.nextInt();
		boolean result=true;

		if (month == 3 && day == 20) {
			System.out.println(result);
		} else if (month == 6 && day == 20) {
			System.out.println(result);
		} else {
			System.out.println("false");
		}
	}
}