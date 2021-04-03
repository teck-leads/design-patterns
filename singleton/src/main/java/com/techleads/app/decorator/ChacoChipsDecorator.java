package com.techleads.app.decorator;

public class ChacoChipsDecorator extends IceCreamDecorator {

	public ChacoChipsDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}

	
	public void addChocoChips() {
		System.out.println("Adding ChocoChips");
	}
}
