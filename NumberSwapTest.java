/* Task 2
 * Swap two numbers without the use of third variable.
 */

package com.basic.operators;

import java.util.Scanner;

public class NumberSwapTest {

	public static void main(String[] args) {
		
		System.out.println("Enter the 1st number: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int number2 = sc.nextInt();
		System.out.println("Number before swap: "+number1+" "+number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Number after swap: "+number1+" "+number2);
		sc.close();
	}

}
