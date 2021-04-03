package com.techleads.app.decorator;
//concrete comonent
public class ChocoCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("Preparing ChocoCream");
	}

}
