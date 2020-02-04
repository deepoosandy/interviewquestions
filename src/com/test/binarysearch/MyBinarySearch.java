package com.test.binarysearch;

import java.util.Arrays;

public class MyBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 18, 3, 7, 9, 20 };
		Arrays.sort(arr);
		System.out.println(getYourSearch(arr, 17, 0, arr.length - 1));
	}

	static boolean getYourSearch(int[] arr, int k, int left, int right) {

		if (right >= left) {
			int mid = (left + right) / 2;
			if (arr[mid] > k) {
				return getYourSearch(arr, k, left, mid - 1);
			}
			if (arr[mid] == k) {
				return true;
			}
			if (arr[mid] < k) {
				return getYourSearch(arr, k, mid + 1, right);
			}

		}
		return false;
	}
}
