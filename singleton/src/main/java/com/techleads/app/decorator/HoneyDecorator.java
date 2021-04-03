package com.techleads.app.decorator;

public class HoneyDecorator extends IceCreamDecorator {

	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}

	
	public void addHoney() {
		System.out.println("Adding Honey");
	}
}
