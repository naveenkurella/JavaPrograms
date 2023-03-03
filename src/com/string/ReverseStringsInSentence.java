package com.string;

public class ReverseStringsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Online Java Compiler";
		String[] str1 = str.split(" ");
		String str2 = "";
		String str3 = "";
		int length = str1.length;
		int counter = 0;
		// Only words reverse in sentence
		for (String singleWord : str1) {

			for (int i = singleWord.length() - 1; i >= 0; i--) {

				str2 += singleWord.charAt(i);

			}

			counter++;
			if (counter < length) {
				str2 += " ";
			}
		}

		System.out.print(str2);
		System.out.println();
		// Entire sentence in Reverse
		for (int j = str.length() - 1; j >= 0; j--) {
			str3 += str.charAt(j);
		}
		System.out.println(str3);
	}

}
