package com.sample;

public class StringMethods {

	public static void main(String[] args) {
		//to find the length
		String S="Welcome";
		System.out.println(S.length());
		//to get the particular value of the string
		System.out.println(S.charAt(0));

		String s1="Welcom to";
		String s2="Trainnig";
		//concordinate 
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		//true
		String a1="Welcom";
		String a2="welcom";
		//equals
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));
		//contains
		System.out.println(a1.contains("Wel"));
		//substring
		System.out.println(a1.substring(0, 3));
		System.out.println(a1.substring(2, 5));
		System.out.println(a1.substring(4, 6));
		
		System.out.println(S.replace("come", "kame"));
	}

}
