package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int total = 0;

		if (arr == null) {
			return 0;
		} else {
			for (int num : arr) {
				total = total + num;
			}
			System.out.println(total);
			return total;
		}
	}
}
