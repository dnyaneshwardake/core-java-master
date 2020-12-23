package com.corejava;

import java.util.Scanner;

public class ReadValuesFromKeyboard {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name ");
		String name = scanner.nextLine();
		
		System.out.println("Enter city: ");
		String city = scanner.nextLine();
		
		System.out.println("Enter contact ");
		long mobile = scanner.nextLong();
		
		System.out.println("================================");
		System.out.println("Name: "+ name);
		System.out.println("City: " +city);
		System.out.println("Contact: "+ mobile);
		
		
		
	}

}
