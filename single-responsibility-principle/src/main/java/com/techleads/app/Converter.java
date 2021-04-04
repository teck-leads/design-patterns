package com.techleads.app;

public class Converter {
	int num1;
	int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static Converter execute(Pair pair) {

		int num1 = Integer.parseInt(pair.getNum1());
		int num2 = Integer.parseInt(pair.getNum1());
		Converter converter = new Converter();
		converter.setNum1(num1);
		converter.setNum1(num2);
		return converter;

	}

}
