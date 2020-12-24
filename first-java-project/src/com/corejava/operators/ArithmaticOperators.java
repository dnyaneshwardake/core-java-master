package com.corejava.operators;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 number..");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a % b;
		
		System.out.println("Answer is " + c);
		
		int d = --c;
		System.out.println("Increment " + d);
		
		
		String name = "Peter";
		

	}

}
