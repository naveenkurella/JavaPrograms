package com.string;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutDuolicates {

	
	    public static void main(String[] args) {
	        String str = "abcabcbb";
	        String longestSubstring = findLongestSubstring(str);
	        System.out.println(findLongestSubstring("developers_write_unit_tests"));
	        System.out.println("The longest substring without duplicates is: " + longestSubstring);
	        //Adding Comments
	    }
	    
	    public static String findLongestSubstring(String str) {
	        if (str == null || str.length() == 0) {
	            return "";
	        }
	        
	        String longestSubstring = "";
	        int startIndex = 0;
	        int endIndex = 0;
	        Set<Character> charSet = new HashSet<>();
	        
	        while (endIndex < str.length()) {
	            if (!charSet.contains(str.charAt(endIndex))) {
	                charSet.add(str.charAt(endIndex));
	                endIndex++;
	            } else {
	                if (endIndex - startIndex > longestSubstring.length()) {
	                    longestSubstring = str.substring(startIndex, endIndex);
	                }
	                charSet.remove(str.charAt(startIndex));
	                startIndex++;
	            }
	        }
	        
	        if (endIndex - startIndex > longestSubstring.length()) {
	            longestSubstring = str.substring(startIndex, endIndex);
	        }
	        
	        return longestSubstring;
	    }
	//Adding Comments

}
