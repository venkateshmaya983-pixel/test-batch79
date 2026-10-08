package com.javaintroduction.methods;

public class testdemomethods1 {
	
	static void add(int a,int b){
		System.out.println("addition method called");
		System.out.println(a+b);
		
	}
	
	static void sub(int a,int b){
		System.out.println("subtraction method called");
		System.out.println(a-b);
		
	}


	public static void main(String[] args) {
		testdemomethods1 a1 = new testdemomethods1();
		System.out.println("main method started");
		add(30,20);
		sub(30,20);
		a1.mul(30,20);
		a1.div(30,20);
		a1.modulus(30,20);
		
		System.out.println("main method ended");

	}
	
	void mul(int a,int b){
		System.out.println("multiplication method called");
		System.out.println(a*b);
		
	}
	
	void div(int a,int b){
		System.out.println("division method called");
		System.out.println(a/b);
	}
	void modulus(int a,int b){
		System.out.println("modulus method called");
		System.out.println(a%b);
	}



	

}
