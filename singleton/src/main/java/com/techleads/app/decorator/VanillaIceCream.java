package com.techleads.app.decorator;
//concrete comonent
public class VanillaIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("Preparing VanillaIceCream");
	}

}
