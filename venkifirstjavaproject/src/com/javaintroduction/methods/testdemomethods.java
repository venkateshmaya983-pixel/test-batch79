package com.javaintroduction.methods;

//method with no value and no parameter
public class testdemomethods {
	
	public static void hello() {
		System.out.println("welcome to java");
		
	}

	public static void main(String[] args) {
		testdemomethods m1 = new testdemomethods();
		System.out.println("main method started");
		hello();
		m1.method();
		
		System.out.println("main method method");

	}
	
	void method() {
	
		System.out.println("good morning");
	}

}
