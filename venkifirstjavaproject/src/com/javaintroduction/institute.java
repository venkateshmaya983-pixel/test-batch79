package com.javaintroduction;

public class institute {
	static String traniername1 = "sathwik";
	static String traniername2 = "ganesh";
	String employeename;
	int employeeid;
	String employeedesignation;

	public static void main(String[] args) {
		System.out.println("traniername1:"+traniername1);
		System.out.println("traniername2:"+traniername2);
		institute emp = new institute();
		emp.employeename = "shannu";
		emp.employeeid = 1;
		System.out.println(emp.employeename);

	}

}
