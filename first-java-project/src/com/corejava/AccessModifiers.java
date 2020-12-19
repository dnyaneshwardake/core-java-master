package com.corejava;

public class AccessModifiers {

	public int employeeId;

	protected String employeeName;

	private int salary;

	int departmentId; // default access modifier

	private void m1() {
		System.out.println("m1");
	}

	protected void m2() {
		System.out.println("m2");
	}

	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
	}

}
