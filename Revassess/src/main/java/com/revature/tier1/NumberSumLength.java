package com.revature.tier1;

import java.util.ArrayList;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		String s = Double.toString(num);

		String[] arr = s.split("");

		int arrLen = CountDigits(num);

		int total = 0;

		for (String s1 : arr) {
			if (!s1.equalsIgnoreCase(".")) {
				int raised = (int) Math.pow(Integer.parseInt(s1), arrLen);
				total += raised;
			}
		}

		if (num == total) {
			return true;
		}


		return false;
	}

	public static int CountDigits(double num) {
		int digits = 0;
		while (num >= 1) {
			digits++;
			num /= 10;
		}
		return digits;
	}
}
