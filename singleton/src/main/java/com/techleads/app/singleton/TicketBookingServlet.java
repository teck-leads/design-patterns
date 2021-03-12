package com.techleads.app.singleton;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		MyPrinter p1 = MyPrinter.getInstance();
		System.out.println(p1.hashCode());

	}
 
}
