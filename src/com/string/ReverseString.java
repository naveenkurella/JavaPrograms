package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Logic-1 Using Concatenation Method
		String str="Microsoft";
		String rev="";
		int i=str.length();
		while(i>0) {
		
			rev=rev+(str.charAt(i-1));
			i--;
			//Adding comments from first branch
			//Adding first branch comments2
		}
		
		System.out.println(rev);
		
		
		
		//Logic-2 Using Character Array
		String str2="Microsoft";
		String rev2="";
		char[] a= str2.toCharArray();
		System.out.println(a);
		int length= a.length;
		for (int j=length-1;j>=0;j--) {
			rev2=rev2+a[j];
		}
		System.out.println(rev2);
		
		
		//Logic-3 Using String Buffer
		String str3="Microsoft";
		StringBuffer sb=new StringBuffer(str3);
		
		System.out.println(sb.reverse());
	}

}
