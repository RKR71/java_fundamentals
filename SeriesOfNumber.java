// Print the sum of series:  1-2+3-4+5-6+7-8+9-10.....+n 
package com.basic.p1;

import java.util.Scanner;

public class SeriesOfNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int ans =0;
		for(int i =1; i<=num; i++) {
			if(i % 2 == 0) {
				ans -= i;
			}else {
				ans += i;
			}
		}
		System.out.println("Sum of series: "+ans);
		sc.close();
	}

}
