package com.test.naggaro;

import java.util.Map;
import java.util.TreeMap;

public class MajorityNumber {

	public static void main(String[] args) {
		int max = ("12111".length()) / 2;
		MajorityNumber majorityNumber = new MajorityNumber();
		System.out.println(majorityNumber.getMajority(majorityNumber.freqCount("12111"), max));
	}

	private String getMajority(Map<Character, Integer> map, int max) {

		StringBuilder s = new StringBuilder();
		for (Map.Entry<Character, Integer> ss : map.entrySet()) {
			String s1 = ss.getKey().toString();
			int value = ss.getValue();
			if (value > max) {
				s.append(s1 + value);
			}
		}
		return s.toString();

	}

	public Map<Character, Integer> freqCount(String input1) {
		char[] ch = input1.toCharArray();
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			char key = ch[i];
			if (map.containsKey(key)) {
				count = map.get(key);
				count++;
			}
			map.put(key, count);
		}

		return map;
	}
}
