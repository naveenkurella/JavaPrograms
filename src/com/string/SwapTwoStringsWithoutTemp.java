package com.string;

public class SwapTwoStringsWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "Hello";
		String b = "World2";
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
