// Print first n factorial of a number.

package com.basic.p1;

import java.util.Scanner;

public class ListOfFactorials {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int fact =1;
		for (int i=1; i<=num; i++) {
			fact = fact*i;
			System.out.println("factorial of "+i+" is: "+fact);
		}
		sc.close();
	}

}
