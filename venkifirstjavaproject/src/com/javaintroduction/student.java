package com.javaintroduction;



public class student {
	int studentid = 001;
	Integer marks = 100;
	int studentid2 = marks;
	Integer i = studentid;
	boolean passstatus = true;


	public static void main(String[] args) {
		student s = new student();
		System.out.println(s.studentid);
		System.out.println(s.marks);
		System.out.println(s.passstatus);
		System.out.println(s.studentid2);
		System.out.println(s.i);
	
		
		
	}

}
