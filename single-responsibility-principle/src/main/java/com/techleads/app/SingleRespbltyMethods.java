package com.techleads.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleRespbltyMethods {
	
	public static final int THRESHOLD = 5;
	 
	public static void main(String[] args) {
	    
	        System.out.println("Welcome to the Application!");
	        
	        List<Integer> nums = extracted();
	        
	        Collections.sort(nums);
	        
	        for(int num : nums)
	            System.out.print(num+" ");
	    }

	private static List<Integer> extracted() {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> nums = new ArrayList<>();
		
		System.out.println("Enter 5 valid integers in the range [0, 10]");
		
		extracted(scanner, nums);
		
		scanner.close();
		return nums;
	}

	private static void extracted(Scanner scanner, List<Integer> nums) {
		while(nums.size() < THRESHOLD) {
		    
		    String s = scanner.nextLine();
		    
		    try {
		        Integer.parseInt(s);
		    } catch (NumberFormatException nfe) {
		        System.out.println("Invalid! Try again!");
		        continue;
		    }
		    
		    int num = Integer.parseInt(s);
		    
		    if(num<0 || num > 10) {
		        System.out.println("Invalid range! Try again!");
		        continue;
		    }
		    
		    nums.add(num);
		}
	}

}
