package com.general;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Nmber to check : ");
		int originalNum=s.nextInt();
		int temp=originalNum;
		int temp2;
		double count=0;
		int digits=String.valueOf(originalNum).length();
		System.out.println(digits);
		
		for(int i =0 ; i< digits; i++) {
				temp2 =	temp%10;
				temp = temp/10;
				count = count + Math.pow(temp2, digits);
			   //System.out.println(count);
		}
		
		if(count==originalNum) {
			System.out.println("It is a Palindrome Num");
		}
		else
		{
		System.out.println("It is not a Palindrome num");
		}
		}
		
		
	}


