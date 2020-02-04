package com.test.cbre;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(new Anagram().isAnagram("sil   ent", "listen "));
	}

	private boolean isAnagram(String str1, String str2) {

		str1 = str1.replaceAll("\\s+", "");
		str2 = str2.replaceAll("\\s+", "");

		if (str1.length() != str2.length())return false;
		
		char[] chars1 = str1.toLowerCase().toCharArray();
		char[] chars2 = str2.toLowerCase().toCharArray();
          
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars1);

	}
}
