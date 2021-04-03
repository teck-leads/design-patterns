package com.techleads.app.decorator;

public class TestApp {

	public static void main(String[] args) {

		IceCream ice1=new VanillaIceCream();
		ice1.prepare();
		System.out.println("======================");
		
		IceCream ice2=new DryFruitDecorator(new VanillaIceCream());
		
		ice2.prepare();
		System.out.println("======================");
		
		IceCream ice3=new DryFruitDecorator(new HoneyDecorator(new VanillaIceCream()));
		ice3.prepare();
		System.out.println("======================");
		
		IceCream ice4=new DryFruitDecorator(new HoneyDecorator(new ChacoChipsDecorator(new VanillaIceCream())));
		ice4.prepare();
		System.out.println("======================");
	}

}
