package com.techleads.app;

public class AppSolution {

	public static void main(String[] args) {
		System.out.println("Welcome to the application");

		//1. taking input from user
		Pair numberPair = UserInputProcessor.getUserInput();
		
		
		
		//2. Get the validate user input
		if(!ValidateInput.validateInput(numberPair)) {
			System.out.println("Invalid user input");
			return;
		};
		
		//convert String values to Integers
//		Converter converter = Converter.execute(numberPair);
		int num1= Integer.parseInt(numberPair.getNum1());
		int num2=Integer.parseInt(numberPair.getNum2());
		
		
		//Get the calculated value 
		int result = Operation.execute(num1, num2);

		
		//displaying the result
		System.out.println("Sum " + result);

	}

}
