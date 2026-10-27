package com.javaintroduction.methods;

public class loanmanagement {
	String costomername = "venki";
	int loanamount = 10000;
	int intrestrate = 2;
	int loantenure = 5;

	 void main(String[] args) {
		loanmanagment v = new loanmanagment();
		// TODO Auto-generated method stub

	}
	
	 double calculateTotalintrest(){
		double intrest = (loanamount*intrestrate*intrestrate)/100;
		 return intrest;
		 
	}
	 
	 double calculateloanamount(double intrest) {
		double loanamountt = loanamount + intrest;
		return loanamountt;
	}
	 double monthlyemi(double loanamountt,int loantenure) {
		  int totalmonths =loantenure * 12; 
		 return totalmonths/12;
	 }
	 void displayloansummary(double intrest,double loanamountt,int totalmonths) {
		 System.out.println(costomername);
		 System.out.println(loanamount);
		 System.out.println(intrestrate);
		 System.out.println("total intrest amount:" + intrest);
		 System.out.println("total calculated loanamount:" + loanamountt);
		 System.out.println("the monthly emi of the loan :" + totalmonths);
		 System.out.println(costomername);
	 }

}
