package com.techleads.app.singleton;

import com.techleads.app.common.CommonUtil;

public class MyPrinter extends CommonUtil {
	//private static volatile MyPrinter instance=null;
	
	private MyPrinter() {
		System.out.println("MyPrinter() 0 param");
	}
	//static factory method
	/*public static MyPrinter getInstance() {
		if (instance == null) {
			instance = new MyPrinter();
		}
		return instance;
	}*/

	//will not work in multithreaded env
	/*
	public synchronized static MyPrinter getInstance() {
		if (instance == null) {
			instance = new MyPrinter();
		}
		return instance;
	}
	*/
	//Solution-2
	private static class InnterPrinter{
		private static volatile MyPrinter instance=new MyPrinter();
	}
	public  static MyPrinter getInstance() {
		
			return InnterPrinter.instance;
	}
	
	
	//Solution-1
	
	/*public  static MyPrinter getInstance() {
		if (instance == null) {
			synchronized (MyPrinter.class) {
				
				if(instance == null) {
					instance = new MyPrinter();
				}
				
			}
			
		}
		return instance;
	}*/
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		//return InnterPrinter.instance;
		throw new CloneNotSupportedException("Cloning is not allowed on singleton class");
	}
}
