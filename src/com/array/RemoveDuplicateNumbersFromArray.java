package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {5,8,8,2,6,7,5,9,2};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length;i++) {
			set.add(a[i]);
		}
		
		Integer result[]=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(result));

		
		//// Remove duplicate numbers without using Set
		/// Remove duplicate numbers from sorted array
		
		int[] b  = {5,8,8,2,6,7,5,9,2};
		Arrays.sort(b);
		int k=0;
		System.out.println(Arrays.toString(b));
		
		for(int j=0; j<b.length-1;j++) {
			
			if(b[j]!=b[j+1]) {
				
				b[k] = b[j];
				k++;
			}
		}
		b[k] = b[b.length-1];
		
		
		System.out.println(Arrays.toString(b));
		
		for (int l=0;l<=k;l++) {
			System.out.print(b[l]+" ");
		}
	}

}
