package com.bridgelabz;

import java.util.Scanner;

public class VowelAndConsonant {
	public static void main(String args[]) {
		System.out.println("Enter the Alphbet");
		Scanner object = new Scanner(System.in);

		char latter = object.next().charAt(0);

		switch (latter) {
		case 'A':
			System.out.println("Its Vowel ");

			break;
		case 'E':
			System.out.println("Its vowel");
			break;
		case 'I':
			System.out.println("Its vowel");
			break;
		case 'O':
			System.out.println("Its vowel");
			break;
		case 'U':
			System.out.println("Its vowel");
			break;
		default:
			System.out.println("Its Consonant");
		}

	}

}
