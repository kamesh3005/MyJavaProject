package com.sample;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {

		String str = "CHARUMATHI";
		String rev = " ";

		/*
		 * int len = str.length(); for (int i = len - 1; i >= 0; i--) {
		 * 
		 * rev = rev + str.charAt(i); } System.out.println(rev);
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the Name :");
		 * 
		 * String nam = sc.nextLine(); int len = nam.length(); for (int i = len - 1; i
		 * >= 0; i--) { rev = rev + nam.charAt(i); }
		 * System.out.println("The Revers String is :" + rev);
		 */
		// Reversing the String using Character Array

		char a[] = str.toCharArray();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);

		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);

	}

}
