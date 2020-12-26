package com.corejava.operators;

import java.util.Scanner;

public class ConparisonOperator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {	
			System.out.println("a is largest number " + a);
		}

		if (a < b) {

			System.out.println("b is largest number " + b);
		}
		
		if (a == b) {

			System.out.println("Both number are same ");
		}

	}

}
