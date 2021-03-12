package com.techleads.app.singleton;

public class MultiThreadTestApp {

	public static void main(String[] args) {

		TicketBookingServlet tkt=new TicketBookingServlet();
	
		
		Thread t1= new Thread(tkt);  
		Thread t2= new Thread(tkt); 
		Thread t3= new Thread(tkt); 
		
		
		Thread t4 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				MyPrinter p1 = MyPrinter.getInstance();
				System.out.println(p1.hashCode());
				
			}
		});
		
		Runnable rn=()->{
			MyPrinter p1 = MyPrinter.getInstance();
			System.out.println(p1.hashCode());
		};
		
		Thread t5=new Thread(rn);
		t5.setName("Thread-5");
		System.out.println(t5.getPriority());
		System.out.println(t5.getName());
		
		t5.start();
		t4.start();
		t3.start();
		t1.start();
		t2.start();
	}

}
