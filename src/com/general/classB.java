package com.general;
import java.util.HashMap;

public class classB {

int firstUniqueCharIndex(String s) {
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		int n=s.length();
		for (int i=0;i<n;i++) {
			
			char c=s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);	
		}
		
		for(int j=0;j<n;j++) {
			if(map.get(s.charAt(j))==1)
				return j;
		}
		
		return -1;
		
	}
}
