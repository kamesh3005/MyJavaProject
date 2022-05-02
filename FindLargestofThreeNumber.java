package com.sample;

import java.util.Scanner;

public class FindLargestofThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number :");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number :");
		int b = sc.nextInt();
		System.out.println("Enter the Third Number :");
		int c = sc.nextInt();
		/*
		 * if(a>b&&a>c) { System.out.println(a+" " +"is greater number"); } else
		 * if(b>a&&b>c) { System.out.println(b+" " +"is greater number"); } else{
		 * System.out.println(c+" " +"is greater number"); }
		 */
		
		//By using Ternary Operator
		
		int larger =a>b?a:b;
		 larger=c>larger?c:larger;
		 System.out.println(larger+" "+"is larger number");
		
	}

}
