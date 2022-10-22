package com.general;

public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=10;
		int sum=0,N1=0,N2=1;
		
		System.out.print(N1+","+N2);
		
		while(length-2>0) {
			
			sum=N1+N2;
			System.out.print(","+sum);
			N1=N2;
			N2=sum;			
			length--;
		}
	}

}
