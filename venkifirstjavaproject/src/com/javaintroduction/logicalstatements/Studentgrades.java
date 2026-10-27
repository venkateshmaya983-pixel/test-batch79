package com.javaintroduction.logicalstatements;

import java.util.Scanner;

public class Studentgrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the percentage");
		int marks = sc.nextInt();

		if ((marks > 100)||(marks < 0)) {
			System.out.println("marks are invalid");
		} else if ((marks >= 90) && (marks < 100)) {
			System.out.println("grade A");
		} else if (marks >= 80) {
			System.out.println("grade B");
		} else if (marks >= 70) {
			System.out.println("grade C");
		} else if (marks >= 60) {
			System.out.println("grade D");
		} else {
			System.out.println("fail");
		}
		sc.close();

	}

}
