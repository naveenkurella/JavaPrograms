	package com.general;

import java.util.Scanner;

public class verifyPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,i,fect=1;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		if(no<=1) {
			
			System.out.println("Smallest prime no is 2");
		}
		for(i=2;i<no;i++) {
			
			if(no%i==0) {
				
				System.out.println("Not Prime");
				break;
			}
			
		} 
		
		if(no==i) {
			
			System.out.println("Prime");
		}
		
		

	}

}
