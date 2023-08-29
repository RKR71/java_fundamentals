// Write a program to count the number of digits in a given number.

package com.basic.p1;
import java.util.Scanner;

public class CountNumberOfDigits {
	
	public static void main(String[] args) {
		System.out.println(" Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int count =0;
		while (num > 0) {
			num = num/10;
			count++;
		}
		System.out.println("Total number of digits is: "+count);
		sc.close();
	}

}
