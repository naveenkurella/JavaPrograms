
package com.general;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();

		// Logic -1 - Using Algorithm
		/*
		 * int rev=0; while(num!=0) {
		 * 
		 * rev=rev*10+num%10; num=num/10;
		 *  } 
		 *  System.out.println("Reverse of number: "+rev);
		 */

		// Logic 2- StringBuffer Class
		/*
		 * StringBuffer rev; 
		 * StringBuffer sb = new StringBuffer(String.valueOf(num));
		 * 
		 * rev = sb.reverse(); 
		 * System.out.println("Reverse Num is" + rev);
		 */

		//
		
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(num);
		sbl.reverse();
		System.out.println("Reverse Num is " + sbl);
	}

}
