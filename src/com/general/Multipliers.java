package com.general;

public class Multipliers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMultiplications(50,5,7);

	}
	
	public static void printMultiplications(int n,int multplier1,int multiplier2) {
		
		
		for(int i=1;i<=n;i++) {
			
			if(i%multplier1==0 && i%multiplier2==0) {
				System.out.println(i+". Multiplier of 5&7");
			}
			else if(i%multplier1==0) { 
				System.out.println(i+". Multiplier of 5");
			}	
			else if(i%multiplier2==0) {
				System.out.println(i+". Multiplier of 7");
			}
			else {
				System.out.println(i+".");
			}
			
		}
		
	}

}
