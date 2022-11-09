package com.array;

public class CountOddNumbersinanIntervalRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOddNumbersinanIntervalRange c= new CountOddNumbersinanIntervalRange();
		int answer=c.countOdds(3, 7);
		System.out.println(answer);
		String s="Average Salary Excluding the Minimum and Maximum Salary";
		System.out.println(s.split(" "));
		
	}
	
	 public int countOdds(int low, int high) {
			/*
			 * int count=0;
			 * 
			 * for(int i=low;i<=high;i++){
			 * 
			 * if(i%2!=0) System.out.println(i); count++; }
			 * 
			 * return count;
			 */
		 
		 //Approach2
		 
		 int diff= high-low;
		 int count=diff/2;
		 
		 if(low%2!=0 || high%2!=0) count++;
		
		 return count;
		 
		 
	    }

}
