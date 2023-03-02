package com.string;

import java.util.StringTokenizer;

public class RemoveExtraSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hey     Remove  extra    spaces   from this     String";
		StringTokenizer stkn=new StringTokenizer(str," ");
		StringBuffer sbf=new StringBuffer();
		
		while(stkn.hasMoreElements()) {
			sbf.append(stkn.nextElement()).append(" ");
		}
		
		System.out.println(sbf);
		

	}

}
