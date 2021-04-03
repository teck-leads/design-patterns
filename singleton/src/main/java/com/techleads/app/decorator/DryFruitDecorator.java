package com.techleads.app.decorator;

public class DryFruitDecorator extends IceCreamDecorator {

	public DryFruitDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addDryFruit();
	}

	
	public void addDryFruit() {
		System.out.println("Adding DryFruit");
	}
}
