package com.string;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String : ");
		Scanner sc=new Scanner(System.in);
		
		String orig_str=sc.nextLine();
		String rev="";
		int length=orig_str.length();
		
		while(length>0) {
			rev=rev+orig_str.charAt(length-1);
			length--;
			
		}
		
		if(orig_str.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}

}
