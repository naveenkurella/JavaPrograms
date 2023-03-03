package com.collectionspractice;

import java.util.LinkedList;

public class LinkedList_Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		LinkedList<Integer> il = new LinkedList<Integer>();
		
		l.add("nk");
		l.add("100");
		l.add(100);
		l.add(true);
		
		//size
		System.out.println(l.size());
		
		//remove
		l.remove("100");
		
		System.out.println(l);
		l.addFirst("AA");
		l.addLast("ZZ");
		System.out.println(l);
		System.out.println(l.getFirst() +" "+ l.getLast());

	}

}
