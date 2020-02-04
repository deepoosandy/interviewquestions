package com.test.goldmansas;

import java.util.HashMap;
import java.util.Map;

public class FindTheLargestSubString {
public static void main(String[] args) {
	String str="Sandeep";
	System.out.println(getLargestSubString(str));
	
	
}

public static String getLargestSubString(String str){
	
	Map<Character,Integer>visited=new HashMap<>();
	String output="";
		for(int start=0,end=0; end< str.length()-1;end++){
			char curchar=str.charAt(end);
			if(visited.containsKey(curchar)){
				System.out.println(start);
				start=Math.max(start+1, 1);
			}
			if(output.length()<end-start+1){
				output=str.substring(start, end);
			}
			visited.put(curchar, end);
		}
	
	
	
	return output;
}


}
