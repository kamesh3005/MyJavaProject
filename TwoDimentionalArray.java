package com.sample;

import java.util.Iterator;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		/*int a[][]=new int [3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		for (int i = 0; i <=2; i++) {
			for (int j = 0; j <=1; j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			
			System.out.println();
			
		}*/
		
		int a[][]= {{ 10,20,30},{40,50,60},{70,80,90},{90,50,60},{41,51,61}};
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
				
				
				
		
		
	}



	

}
