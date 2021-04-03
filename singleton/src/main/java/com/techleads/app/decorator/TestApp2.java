package com.techleads.app.decorator;

import java.io.*;
import java.util.Scanner;


public class TestApp2 {

	public static void main(String[] args) {

		
		
		try {
			/*
			Java IO streams is desingned basedon decorator/wrapper Design pattern
			
			In that InputStream/OutputSteam/Reader/Writer are componenent interfaces
			FileInputStream/FileOutputStream/FileReader
			are the concreate compoentn classes
			
			BufferedReader, BufferedWriter, DataInputStream etc are the concreate decorator classes
			*/
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc =new Scanner(System.in);
			
			DataInputStream dis=new DataInputStream(new FileInputStream("e:/abc.txt"));
			ObjectInputStream ios=new ObjectInputStream(new FileInputStream("e:/abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		IceCream ice1=new ButterScrochCream();
		
		
		ice1.prepare();
		System.out.println("======================");
		
		IceCream ice2=new DryFruitDecorator(new ButterScrochCream());
		
		ice2.prepare();
		System.out.println("======================");
		
		IceCream ice3=new DryFruitDecorator(new HoneyDecorator(new ButterScrochCream()));
		ice3.prepare();
		System.out.println("======================");
		
		IceCream ice4=new DryFruitDecorator(new HoneyDecorator(new ChacoChipsDecorator(new ButterScrochCream())));
		ice4.prepare();
		System.out.println("======================");
		
		
		IceCream ice5=new DryFruitDecorator(new ChacoChipsDecorator(new ChacoChipsDecorator(new ButterScrochCream())));
		ice5.prepare();
		System.out.println("======================");
	}

}
