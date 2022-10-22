package com.string;

import java.util.ArrayList;
import java.util.List;

public class CountTheDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		
		String num="22575572110";
		String result="";
		char[] digits=num.toCharArray();
	//	System.out.println(digits[0]);
		//char say = num.charAt(0);
		//System.out.println(say);
		int count=1;
		int startAt=0;
		
			for(int j=startAt;j<digits.length;j++) {
				//System.out.println("loop j");
			//	System.out.println(digits[j]);
				//System.out.println(digits[j+1]);
				if(j+1<digits.length) {
				if(digits[j]==digits[j+1]) {
					//System.out.println("if");
					count++;
					startAt++;
				}
				
				else {
					//System.out.println("loop else");
					result = result + list.get(count-1)+digits[j]+"," ;
					//System.out.println(result);
					count=1;
					
				}
				}
				else {
				result = result + list.get(count-1)+digits[j] ;
				System.out.println(result);
				}
			}
		
			//System.out.println(result);
		}
		
	

}
