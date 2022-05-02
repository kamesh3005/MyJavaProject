package com.sample;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String rev=" ";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String..");
		String str = sc.next();
		String org_str=str;
		int len = str.length();
		
		char a[] = str.toCharArray();
		
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str + "The String Palindrome");
		}
		else
		{
			System.out.println(org_str + "The String is Non-Palindrome");
		}
		

	}

}
