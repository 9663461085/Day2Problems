package com.bridgelabz;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		/*
		 * Declaring Variables ..
		 */
	int number=10;
	int sum=0;
	int i=1;
	/*
	 * Checking the condition by using While loop
	 */
	while(i<=number) {
		sum=sum+i;
		i++;
	}
System.out.println(sum);
}
}