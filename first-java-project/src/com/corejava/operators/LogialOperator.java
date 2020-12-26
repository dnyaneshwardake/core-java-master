package com.corejava.operators;

import java.util.Scanner;

public class LogialOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b && a > 50) {	
			System.out.println("a is gretter than 50");
		}

	}

}
