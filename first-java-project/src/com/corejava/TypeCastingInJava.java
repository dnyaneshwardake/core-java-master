package com.corejava;

public class TypeCastingInJava {
	
	public static void main(String[] args) {
		
		// Widening Casting demo
		int employeeId = 111;
		long empId = employeeId;
		
		System.out.println(employeeId);
		System.out.println(empId);
		

		//Narrowing Casting Demo
		
		double salary = 555.30;
		
		int mySalary = (int) salary;
		
		System.out.println("My Salary = " + mySalary);
		
	}

}
