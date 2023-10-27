package com.string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int length=lengthOfLastWord("adhdh hljghf jkjfkrf kkjfkejfk.");
		
		System.out.println(length);

	}

	private static int lengthOfLastWord(String s) {
		// TODO Auto-generated method stub
		int counter = 0;
		int Slength=s.length();
		boolean flag=false;
		for(int j=Slength-1; j>0;j--) {
			char c=s.charAt(j);
			if((c>= 'a' && c<= 'z') || ( c >= 'A' && c<= 'Z') || c == '.') {
				
				flag= true;
				counter ++;
				
				if(c== '.') {
					counter --;
				}
			}
			
			else
			{
				if(flag)
					return counter;
			}
			
			
			
		}
		
		return counter;
	}

}
