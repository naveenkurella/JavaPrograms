package com.array;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] salary = { 4000, 3000, 1000, 2000,5000 };

		int max = salary[0];
		int min = salary[0];
		double sum = 0;

		int length = salary.length;

		for (int i = 0; i < length; i++) {

			if (salary[i] > max) {
				max = salary[i];
			}
			if (salary[i] < min) {
				min = salary[i];
			}

			sum = sum + salary[i];
		}

		double answer=(sum-max-min)/(length-2);
		System.out.println(answer);
	}

}
