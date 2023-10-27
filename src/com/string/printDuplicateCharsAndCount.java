package com.string;

import java.util.HashMap;
import java.util.Map;

public class printDuplicateCharsAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "naveen Kurella";
		 String st = s.replaceAll("//s", "").toLowerCase();
	        
	        char[] c =  st.toCharArray();
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        
	        for(Character k : c){
	            
	            if(map.containsKey(k)){
	                
	                map.put(k, map.get(k)+1);
	            }
	            
	            else{
	                map.put(k,1);
	            }
	            
	        }
	        
	        for(char ca : map.keySet()){
	            
	            if(map.get(ca)>1){
	                
	                 System.out.println( ca + " repeated "+ map.get(ca) + " times");
	            }
	            
	        }
	        
	        
	    }
	}


