/* Task 1.
 * Write a program to add 8 to the number x and then divide it by 3. Now, 
 * the modulus of the quotient is taken with 5 and then multiply the 
 * resultant value by 5. Display the final result.
 * Input: 2345
 * Output: 20
 */

package com.basic.operators;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Enter the Input: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int resultant_expression = (((x+8)/3)%5)*5;
		System.out.println("Output: "+resultant_expression);
		sc.close();
	}

}
