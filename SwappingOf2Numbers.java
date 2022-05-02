package com.sample;

public class SwappingOf2Numbers {
	
	
	
	
	public static void main(String[] args) {
		

		int a=10;
		int b=50;
		System.out.println("Befor swapping of the two Number"+a+" "+b);
		/*logic 1 by using third variable
		 * int t=a;//t=10 a=b;//a=50 b=t;//b=10
		 * 
		 */
		//without using third variable
		//a=a+b;//10+50=60
		//b=a-b;//60-50=10
		//a=a-b;//60-10=50
		
		//loging 3 use *and/ without using third variable
		
		a=a*b;//10*50=500
		b=a/b;//500/50=10
		a=a/b;//500/10=50
		
		  
		  System.out.println("After swapping of the two numbers"+a+" "+b);
		
	}
	
	
	
	
	

}
