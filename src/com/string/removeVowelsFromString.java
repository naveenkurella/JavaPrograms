package com.string;

import java.util.Scanner;

public class removeVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       String str1, str2;
		       Scanner scan = new Scanner(System.in);
		 
		       System.out.print("Enter a String : ");
		       str1 = scan.nextLine();
		 
		       str2 = str1.replaceAll("[aeiouAEIOU]", "");
		 
		       System.out.print("All Vowels Removed Successfully..!!\nNew String is : ");
		 
		       System.out.print(str2);
		
	}

}
