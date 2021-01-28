package com.corejava.controlstatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

		System.out.println("Enter two numbers: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // 10
		int b = scanner.nextInt();

		IfStatement object = new IfStatement();
		//object.larestNumberUsinIf(a, b);
		//object.larestNumberUsinIfElse(a, b);
		
		object.larestNumberUsinIfElseLadder(a, b);

	}
	
	public void larestNumberUsinIfElseLadder(int a, int b) {
		if(a>b) {
			System.out.println("a is larest");
			
		}
		else if(b>a) {
			System.out.println("b is larest");
		}
		else if(a==b) {
			System.out.println("a is equal to b");
		}
		else 
		{
			System.out.println("a and b are not numbers");
		}
	}
	
	public void larestNumberUsinIfElse(int a, int b) {
		if(a>b) 
			{
				System.out.println("a is larest number");
			}
		else 
			{
				System.out.println("b is larest");
			}
		
	}

	public void larestNumberUsinIf(int a, int b) {

		if (a > b) {
			System.out.println("a is larest number");
		}

		if (b > a) {
			System.out.println("b is larest number");
		}

	}

}
