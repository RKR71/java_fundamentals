// Sum of digits of  a number.

package com.basic.p1;

import java.util.Scanner;

public class FindSumOfDigits {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int sumOfDigits =0;
		while (num > 0) {
			sumOfDigits += num%10;
			num = num/10;
			
		}
		System.out.println("Total sum of digits is: "+sumOfDigits);
	}

}
