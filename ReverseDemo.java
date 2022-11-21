package com.bridgelabz;

public class ReverseDemo {
public static void main(String args[]) {
	int number=12324;
	int reverse=0;
	int reminder;
	for(;number!=0;) {
		reminder = number % 10;
		reverse = (reverse * 10) + reminder;
		number = number / 10;
	}
	System.out.println(reverse);
}
}
