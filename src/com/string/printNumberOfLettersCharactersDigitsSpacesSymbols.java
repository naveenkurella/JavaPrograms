package com.string;

import java.util.Scanner;

public class printNumberOfLettersCharactersDigitsSpacesSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		char[] ca = st.toCharArray();
		int Letters = 0,Digits=0,Spaces=0,Symbols=0;
		
		
		for (char c : ca) {
			
			if(Character.isLetter(c)) {
				Letters++;
			}
			else if(Character.isDigit(c)) {
				Digits++;
			}
			else if(Character.isSpaceChar(c)) {
				Spaces++;
			}
			else{
				
				Symbols++;
				
			}
		}
		
		System.out.println("Letters :"+Letters + " Digits :" +Digits + " Spaces :" + Spaces + " Symbols :" + Symbols);;
	}

}
