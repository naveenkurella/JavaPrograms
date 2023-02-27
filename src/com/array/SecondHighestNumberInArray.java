package com.array;

import java.util.Arrays;
import java.util.Random;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int arr[] = { 100,14, 46, 47, 94, 95, 52, 86, 36, 96, 89 };
		 
		/* int largest=0,secondlargest=0, thirdlargest=0;
		 
		System.out.println("The given array is");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				
				secondlargest = largest;
				
				largest = arr[i];
				
			}
			else if(arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
			
		}
		
		System.out.println("Largest "+ largest);
		System.out.println("Second largest "+ secondlargest);
		System.out.println("Third largest "+ thirdlargest); */
		 
		// SecondHighestNumberInArray s=new SecondHighestNumberInArray();
		// System.out.println(s.findKthLargest(arr,4));
		 
		// Arrays.sort(arr);
		// System.out.println(arr[arr.length-4]);
		 
		 
		 System.out.println( findNthLargest(arr, 4));

	}
	
	
    public static int findNthLargest(int[] arr, int n) {
    	  if (arr == null || n < 1 || n > arr.length) {
              throw new IllegalArgumentException("Invalid input");
          }
          
          int max = Integer.MAX_VALUE;
          int nthLargest = 0;
          
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < arr.length; j++) {
                  if (arr[j] > nthLargest && arr[j] < max) {
                      nthLargest = arr[j];
                  }
              }
              
              max = nthLargest;
              nthLargest = 0;
          }
          
          return max;

    }
	
	
    public  int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        return quickselect(nums, 0, nums.length - 1, k);
    }

    private int quickselect(int[] nums, int l, int r, int k) {
        while (l < r) {
            final int p = partition(nums, l, r);

            if (p >= k) r = p;
            else l = p + 1;
        }

        return nums[k];
    }

    private int partition(int[] nums, int l, int r) {
        final int pivot = nums[ l + new Random().nextInt(r - l) ];
        int i = l - 1, j = r + 1;

        while (true) {
            while (nums[--j] > pivot);
            while (nums[++i] < pivot);

            if (i >= j) return j;
            
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
