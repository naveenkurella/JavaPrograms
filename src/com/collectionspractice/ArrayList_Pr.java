package com.collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayList_Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al = new ArrayList(); //Heterogeneous data
		ArrayList<String> sal=new ArrayList<>(); //Homogeneous data
		
		List li=new ArrayList();
		
		
		al.add(12);
		al.add("Welcome");
		al.add(15.5);
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		
		
		//Methods size
		System.out.println(al.size());
		//remove
		al.remove(4); //5 is index or object
		
		System.out.println(al);
		//add with index
		al.add(1, 'B');
		System.out.println(al);
		
		//get
		System.out.println(al.get(2));
		
		//set
		al.set(4, false);
		System.out.println(al);
		
		//Search
		System.out.println(al.contains(false));
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		for(Object e:al) {
			System.out.println(e);
		}
		
		
		Iterator it=al.iterator();
		it.hasNext();
		
		sal.add("A");
		sal.add("E");
		sal.add("D");
		sal.add("B");
		System.out.println(sal);
		//sal.sort(null);
	//		System.out.println(sal);
		Collections.sort(sal,Collections.reverseOrder());
		System.out.println(sal);
		
		Collections.shuffle(al);
		System.out.println(al);
	
	}

}
