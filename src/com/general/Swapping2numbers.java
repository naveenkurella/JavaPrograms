package com.general;

public class Swapping2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logic 1--Using Third Variable
		int a = 10, b = 20;
		System.out.println("Using third variable");
		int t = a;
		a = b;
		b = t;
		System.out.println("After swapping a=" + a + "," + "b=" + b);

		// Logic 2--Without Third Variable
		int c = 10, d = 20;
		System.out.println("Without Third Variable");
		c = c + d; // 10+20 =30
		d = c - d; // 30-20 = 10
		c = c - d; // 30-10=20
		System.out.println("After swapping c=" + c + "," + "d=" + d);
		
		
		///Logic 3 -- Without Third Variable ,using * and /
		int e = 10, f = 20;
		System.out.println("Without Third Variable ,using * and /");
		e = e*f; // 10*20 =200
		f = e/f; // 200/20 = 10
		e = e/f; // 200/10=20
		System.out.println("After swapping e=" + e + "," + "f=" + f);
		
		//Logic-4 bitwise XOR(^) operator
		int g = 10, h = 20;
		System.out.println("Without Third Variable ,using XOR operator");
		g = g^h; 
		h = g^h; 
		g = g^h;
		System.out.println("After swapping e=" + g + "," + "f=" + h);
		
		//Logic 5 - Single statement
		int i=10,j=20;
		System.out.println("Without Third Variable ,using single statement");
		j=i+j-(i=j);
		System.out.println("After swapping e=" + i+ "," + "f=" + j);

	}

}
