package com.test.iomedia;

import java.util.HashMap;
import java.util.TreeSet;

interface Add{
int	add(int a, int b);
}
public class TreeSetTest {
	public static void main(String[] args) {
		HashMap map;
		//map.put(key, value)
		Add add=(a,b)->a+b;
		System.out.println(add.add(2, 5));
		
		TreeSet<Age> t = new TreeSet<>();
		Age a = new Age();
		a.setName(1);
		Age b = new Age();
		b.setName(1);
		t.add(a);
		t.add(b);
	}
}

class Age {
	int name;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

}
