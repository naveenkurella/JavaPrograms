package com.array;

public class miniumNumberAndMaxNumberInColumnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4 , 5 }, { 3, 0 ,5 }, { 1, 2,4 } };

		int min = a[0][0];
		int max = a[0][0];
		int minNumberColumnIndex = 0;

		System.out.println(a.length);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (a[i][j] < min) {
					min = a[i][j];
					minNumberColumnIndex = j;
				}
			}

		}

		for (int i = 0; i < 3; i++) {

			if (a[i][minNumberColumnIndex] > max) {
				max = a[i][minNumberColumnIndex];
			}
		}

		System.out.println("Min="+min);
		System.out.println("Max="+max);
	}


}
