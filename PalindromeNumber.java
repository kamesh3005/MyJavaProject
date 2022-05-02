package com.sample;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num = sc.nextInt();

		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
		num = num / 10;
		}
		if(rev==org_num) {
			
			System.out.println("The Number is PalindromeNumber");
		}
		
		else
		{
			System.out.println("The Number is Not PalindromeNumber");
		}
	}
	

}
