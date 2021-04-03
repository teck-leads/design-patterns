package com.techleads.app.decorator;

public abstract class IceCreamDecorator implements IceCream {

	private IceCream iceCream; //componsition HAS - A - relation 
	
	
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}



	@Override
	public void prepare() {
		iceCream.prepare();
	}

}
