package com.test.iomedia;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModificationError {
public static void main(String[] args) {
	HashMap<Integer, Integer>map=new HashMap<>();
	map.put(1, 1);
	map.put(2, 1);
	map.put(3, 1);
	Iterator<Integer>ii=map.keySet().iterator();
	while(ii.hasNext()){
		
		System.out.println(ii.next());
		map.put(4, 5);
	}
	
}
}
