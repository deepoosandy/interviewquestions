package com.test.naggaro;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyCounter {
	
	public static void main(String[] args) {
		System.out.println(new FrequencyCounter().freqCount("pqghh"));
	}
	
	public String freqCount(String input1){
		char[]ch=input1.toCharArray();
		
		Map<Character,Integer>map=new TreeMap<>();
		StringBuilder finalString=new StringBuilder();
		for(int i=0;i<ch.length;i++){
			int count=1;
			char key=ch[i];
			if(map.containsKey(key)){
				 count=map.get(key);
				 count++;
			}
			map.put(key, count);
		}
		for(Map.Entry<Character, Integer>ss:map.entrySet()){
			String s=ss.getKey().toString();
			finalString.append(s+ss.getValue());
		}
		return finalString.toString();
	}

}
