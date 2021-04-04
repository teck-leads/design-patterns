package com.techleads.app;

public class ValidateInput {

	public static boolean validateInput(Pair userInput) {

		boolean flag = true;

		String num1 = userInput.getNum1();

		try {
			Integer.parseInt(num1);
		} catch (NumberFormatException e) {
			return false;
		}
		String num2 = userInput.getNum2();
		try {
			Integer.parseInt(num2);
		} catch (NumberFormatException e) {
			return false;
		}

		return flag;

	}

}
