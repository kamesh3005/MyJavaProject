package com.sample;

public class CountnumberOfDigit {

	public static void main(String[] args) {
		
		
		
		long num=123456;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("The Number of count is :"+count);
		
	}		
	}


