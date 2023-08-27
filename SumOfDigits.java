/*
 * Write a program to calculate the sum of the digits of a 3-digit number.
 */

package com.basic.operators;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 100 || num > 999) {
			System.out.println("Please enter a valid 3-digit number");
		}
		else {
			int digit1 = num/100;
			int digit2 = (num/10)%10;
			int digit3 = num%10;
			int digitSum = digit1+digit2+digit3;
			System.out.println("Sum of digits: "+digitSum);
		}
		sc.close();
	}
	
}
