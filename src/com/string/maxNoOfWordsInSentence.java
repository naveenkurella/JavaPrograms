package com.string;

public class maxNoOfWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	int max =	mostWordsFound(str);
	System.out.println(max);
	}

	public static int mostWordsFound(String[] sentences) {
        int max=0;
   for(int i=0; i<sentences.length; i++) {
       max = Math.max(max,(sentences[i].split(" ")).length);
   }
   return max;
}
}

