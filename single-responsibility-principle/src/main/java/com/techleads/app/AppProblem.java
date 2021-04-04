package com.techleads.app;

import java.util.Scanner;

public class AppProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to the application");

		//1. taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		String firstNumber = sc.nextLine();
		System.out.println("Enter second number: ");
		String secondNumber = sc.nextLine();
		sc.close();

		
		//2. validating user input
		if (null == firstNumber) {
			System.out.println("Invalid number");
			return;
		}

		if (null == secondNumber) {
			System.out.println("Invalid number");
			return;
		}

		int firstInteger = 0;
		int secondInteger = 0;

		try {
			firstInteger = Integer.parseInt(firstNumber);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}

		try {
			secondInteger = Integer.parseInt(secondNumber);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}

		//calculating 
		int result = (firstInteger + secondInteger);

		
		//displaying
		System.out.println("Sum " + result);

	}

}
