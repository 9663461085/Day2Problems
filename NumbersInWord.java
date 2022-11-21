package com.bridgelabz;

import java.util.Scanner;

public class NumbersInWord {
public static void main(String args[]) {
	System.out.println("Enter the number");
	Scanner object=new Scanner(System.in);
	int number=object.nextInt();
	
	if(number==0) {
		System.out.println("ZERO");
	}
	else if(number==1) {
		System.out.println("ONE");
	}

	else if(number==2) {
		System.out.println("TWO");
		}
	else if(number==3) {
		System.out.println("THREE");
	}
	else if(number==4) {
		System.out.println("FOUR");
	}
	else if(number==5) {
		System.out.println("FIVE");
	}
	else if(number==6) {
		System.out.println("SIX");
	}
	else if(number==7) {
		System.out.println("SEVEN");
	}
	else if(number==8) {
		System.out.println("EIGTH");
	}
	else if(number==9) {
		System.out.println("NINE");
	}
	else {
		System.out.println("Enter valid number");
	}
}
}


