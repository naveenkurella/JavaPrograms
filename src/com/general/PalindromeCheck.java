package com.general;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Added Comments
		//Added Second Commit
		//Added 3rd comment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int orig_num = sc.nextInt();
		int num=orig_num;
		int rev=0;
		//Adding cherry pick line
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
			
		}

		System.out.println(rev +"  "+orig_num);
		if(rev==orig_num)
			System.out.println("It is Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
