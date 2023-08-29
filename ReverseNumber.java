// Program to reverse a given number. 

package com.basic.p1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = 0;
		while(num > 0) {
			revNum = revNum * 10 +num % 10;
			num /= 10;
		}
		System.out.println("Reverse number is: "+revNum);
		sc.close();
	}

}
