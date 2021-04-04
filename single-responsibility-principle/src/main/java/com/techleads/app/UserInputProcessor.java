package com.techleads.app;

import java.util.Scanner;

public class UserInputProcessor {

	

	public static Pair getUserInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		String num1 = sc.nextLine();
		System.out.println("Enter second number: ");
		String num2 = sc.nextLine();
		sc.close();
		Pair pair=new Pair(num1,num2);
		return pair;
	}

}
