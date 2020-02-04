package com.test.naggaro;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;

public class VariableConverter {
public static void main(String[] args) {
	CopyOnWriteArrayList<Integer>al=new CopyOnWriteArrayList<Integer>();
	al.add(null);
	al.add(null);
	System.out.println(al);
	BlockingQueue<Integer>bl=new ArrayBlockingQueue<>(10);
	bl.add(null);
	bl.add(null);
	System.out.println(bl);
	
	/*ConcurrentHashMap<Integer, Integer>conmap=new ConcurrentHashMap<Integer, Integer>();
	conmap.put(null, null);*/
	
}
}
