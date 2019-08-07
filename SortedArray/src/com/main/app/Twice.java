package com.main.app;

public class Twice {

	public static void main(String[] args) {

		// int[] arr1 = {1,1,2,3,3,4,4,8,8};
		int[] arr1 = { 3, 3, 7, 7, 10, 11, 11 };

		int res = 0;

		for (int i = 0; i < arr1.length - 1; i += 2) {
			if (arr1[i] != arr1[i + 1]) {
				res = arr1[i];
			} else {
				res = arr1[arr1.length - 1];
			}
		}
		System.out.println(res);
	}
}
