package com.techleads.app.decorator;
//concrete comonent
public class ButterScrochCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("Preparing ButterScrochCream");
	}

}
