package com.sample;

public class EvenCountAndOddCount {

	public static void main(String[] args) {
		int even_count = 0;
		int odd_count = 0;

		int num = 13579;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("The EvenCount of the number is"+even_count);
		System.out.println("The OddCount of the numbers"+odd_count);

		

	}

}
