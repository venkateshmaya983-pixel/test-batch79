package com.javaintroduction;


	

public class testdatatypes3 {
	int rollnumber;
	String studentname;
	String course;
	String subjectname1;
	String subjectname2;
	String subjectname3;
	int subjectmarks1;
	int subjectmarks2;
	int subjectmarks3;
	


  void displaystudentdetails() {
	  System.out.println(rollnumber);
	  System.out.println(studentname);
	  System.out.println(course);
	  System.out.println(subjectname1);
	  System.out.println(subjectname2);
	  System.out.println(subjectname3);
	  
	  
	  
  }
  void calculatetotal() {
		int total = subjectmarks1+subjectmarks2+subjectmarks3;

	  System.out.println("total marks "+total);
	  
	  
  }
  void calculateavg() {
	   int average = subjectmarks1+subjectmarks2+subjectmarks3/3;
	  System.out.println("average: " + average);
	  
  }

	public static void main(String[] args) {
		testdatatypes3 s = new testdatatypes3();
		s.rollnumber = 01;
		s.studentname = "sathwik";
		s.course = "cse";
		s.subjectname1 = "java";
		s.subjectname2 = "python";
		s.subjectname3 = "data structures";
		s.subjectmarks1 = 80;
		s.subjectmarks2 = 70;
		s.subjectmarks3 = 50;
		
		s.displaystudentdetails();
		s.calculateavg();
		s.calculatetotal();
		
		

	}

}

