package com.sample;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		long num = sc.nextLong();
		/*Using the Algorithm
		 * int rev=0; while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 */
		//using the StringBuffer Class
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); StringBuffer rev =
		 * sb.reverse(); System.out.println("The reverse Number is: "+rev);
		 */
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder reverse = sbl.reverse();
		System.out.println("The Reverse Number is: "+reverse);
	}

}
