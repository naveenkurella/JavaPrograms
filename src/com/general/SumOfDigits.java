package com.general;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=12356;
         int temp=0;
         while(num>0) {
        	 
        	 temp=temp+num%10;
        	 num=num/10;
        	 
         }
         
         System.out.println(temp);
         
	}

}
