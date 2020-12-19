package com.corejava;

public class VariablesInJava {
	
	double distance;
	int departmentId = 123; // Global variable.
	String name = "Peter";	// Global variable

	public void m1() {
		System.out.println("Distance is = "+distance);
		System.out.println("Name = "+ name);
		System.out.println("Depatment ID = " +departmentId);
		
		int employeeId=10; // Local variable (Local variable must be initilized)

		System.out.println("Employee ID = " +employeeId);
	}


	public static void main(String[] args) {
		VariablesInJava obj = new VariablesInJava();
		obj.m1();
	}

}
