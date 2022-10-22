package com.general;

public class CountEvenAndOddNumbersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=446638949;
		int even_count=0,odd_count=0;
		int temp;
		while(num>0) {
			temp=num;
			temp=temp%10;
			if(temp%2==0) {
				even_count++;
			}
			
			else {
				odd_count++;
			}
			
			num=num/10;
		}
		
		System.out.println(even_count+"  "+odd_count);

	}

}
