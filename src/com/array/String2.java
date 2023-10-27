package com.array;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String c = "My Name is Naveen Employee Id: 12345 timestamp is 2023:09:14 03:11:256 PM IST";

				String[] splitS= c.split("is");
                           
				
				
				
				String str2 = splitS[2];

				String str3[] = str2.split(":");
				String str4[] = str3[2].split(" ");
				
				System.out.println(str4[0]);

	}

}
