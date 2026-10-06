package com.javaintroduction;

public class bankaccount {
	static int balance = 1000;
	
	 static void deposite(){
		balance = balance + 500;
		System.out.println("amount deposte:" +balance);
	}
	
	static void withdrawl() {
		balance = balance - 300;
		System.out.println("amount withdrawl:" +balance);
	}

	public static void main(String[] args) {
		System.out.println("intialbalance:" +balance);
		deposite();
		withdrawl();
		System.out.println("final balance:" +balance);
		
		

	}

}
