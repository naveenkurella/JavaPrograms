package com.string;

import java.util.HashMap;

public class CountNoOfWordsInStringUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text= "This program counts the no no of words in in this string";
		String textArr[] = text.split(" ");
		System.out.println(textArr.toString());
		HashMap<String, Integer> map = new HashMap<>();
		
		for( int i = 0 ; i < textArr.length; i++) {
			
			if(map.containsKey(textArr[i])) {
				int count = map.get(textArr[i]);
				
				map.put(textArr[i], count+1);
					
				}
			else 
			{
				map.put(textArr[i], 1);
			}
			
			
			
		}
		
		System.out.println(map);
		

	}

}
