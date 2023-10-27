package com.general;

public class separateCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc#$#23asc";

		char[] c = a.toCharArray();

		String chars = "";
		String SplChars = "";
		String Nums = "";

		for (int i = 0; i < a.length(); i++) {

			if (c[i] >= 'a' && c[i] < 'z') {

				chars += c[i];
			}

			else if (c[i] >= '!' && c[i] <= '/') {
				SplChars += c[i];
			} else if (c[i] >= '0' && c[i] <= '9') {
				Nums += c[i];
			} else {
				System.out.println("Inappropriate String");
			}

		}

		System.out.println("Given String : " + a);
		System.out.println("Expected Output as below");
		System.out.println("Characters : " + chars);
		System.out.println("Special Characters : " + SplChars);
		System.out.println("Numerics : " + Nums);

	}

}
