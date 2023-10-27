package com.general;

import java.util.Scanner;

public class SumOfDigitsUntilOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int original_num = sc.nextInt();
		int temp_Sum =0;
		//int result = 0;
		
		
		while(original_num >0) {
	
			temp_Sum = temp_Sum+original_num%10;;
			
			if(temp_Sum>10) {
				
				 temp_Sum = (temp_Sum/10)+(temp_Sum%10);
				
			}
			
		original_num=original_num/10;
	//	System.out.println(original_num);
			
		}
		
		System.out.println("Sum of digits : " + temp_Sum);
		/*
		 * if(temp_Sum<10) {
		 * 
		 * System.out.println("Sum of digits : " + temp_Sum); } else {
		 * //System.out.println("Sum of digits : " + result); }
		 */

	}

}
