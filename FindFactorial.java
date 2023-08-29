package com.basic.p1;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		int i =1;
		while(i <= num) {
			fact = fact*i;
			i++;
		}
		System.out.println("factorial of "+num+" is: "+fact );
		sc.close();
	}

}
