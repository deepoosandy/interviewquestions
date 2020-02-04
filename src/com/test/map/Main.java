package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		Employee e1=new Employee("Sandeep",20);
		Employee e2=new Employee("Sandeep",28);
		
		map.put(e1, "First Employee");
		map.put(e2, "Second Employee");
		System.out.println(map.size());
		
	}
}
