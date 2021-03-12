package com.techleads.app.singleton;

public class SingleCloning {

	public static void main(String[] args)  {
		//get 
		MyPrinter p1 = MyPrinter.getInstance();
		
		try {
			MyPrinter p2 = (MyPrinter) p1.clone();
			System.out.println(p1.hashCode()+" "+p2.hashCode());
			System.out.println("p1==p2? "+(p1==p2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
