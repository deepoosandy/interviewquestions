package com.test.niit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

public class NIITTest implements Comparator<NIITTest> {
	int dishSize;
public NIITTest(int i) {
		// TODO Auto-generated constructor stub
	dishSize=i;
	}

public static void main(String[] args) {
	NIITTest [] v={new NIITTest(40),new NIITTest(200),new NIITTest(60)};
	Arrays.sort(v,v[0]);
	int index=Arrays.binarySearch(v, new NIITTest(40),v[0] );
	System.out.print(index+ " ");
	 index=Arrays.binarySearch(v, new NIITTest(80),v[0] );
	System.out.print(index);
	TreeSet<String>t=new TreeSet<>();
}

@Override
public int compare(NIITTest o1, NIITTest o2) {
	// TODO Auto-generated method stub
	return o2.dishSize-o1.dishSize;
}
}
