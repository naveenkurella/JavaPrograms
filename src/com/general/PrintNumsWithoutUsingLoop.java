package com.general;

public class PrintNumsWithoutUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			printNums(1,100);
	}
	
	
	static void printNums(int counter, int length) {
		
		if(counter<=100) {
			System.out.println(counter);
			counter++;
			printNums(counter,length);
		}
		
	}
	
	
}
