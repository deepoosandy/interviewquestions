package com.test.niit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class A1 {

	public void display() {
		System.out.println("A");
	}
}

class B1 extends A1 {
	int j;

	public void display() {
		System.out.println("B");
	}
}

class C extends A1 {
	public void display() {
		System.out.println("C");
	}
}

public class Dynamic_Dispatch {
	public static void main(String[] args) {
		B1 b = new B1();
		C c = new C();
		// b=c;
		newdisplay(b);

	}

	public static void newdisplay(A1 a) {
		// a.display();
		int arr[] = { 1, 5, 2, 18, 3, 7, 9, 20 };
		Arrays.sort(arr);
		System.out.println(numberFound(arr, 20, 0, arr.length - 1));
		System.out.println(reverseMyName("Sandeep"));
		int arr1[] = { 8, 1, 2, 3, 6 };
		Arrays.sort(arr1);
		System.out.println(findMissingArryElement(arr1));

	}

	public static List<Integer> findMissingArryElement(int arr[]) {
		List<Integer> list = new ArrayList<>();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			input.add(arr[i]);
		}
		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
			System.out.println(i + " " + !input.contains(i));
			if (!input.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public static String numberFound(int arr[], int number, int l, int r) {

		int mid = (l + r) / 2;
		if (r >= l) {
			if (arr[mid] > number) {
				return numberFound(arr, number, l + 1, mid);
			}
			if (arr[mid] == number) {
				return "YES";
			} else if (arr[mid] < number) {
				return numberFound(arr, number, mid + 1, r);
			}
		}
		return "NO";
	}

	static String p = "";

	private static String reverseMyName(String str) {
		if (str.length() > 0) {
			String str1 = str.substring(str.length() - 1, str.length());
			p = p + str1;
			reverseMyName(str.substring(0, str.length() - 1));
		}
		return p;
	}

}
