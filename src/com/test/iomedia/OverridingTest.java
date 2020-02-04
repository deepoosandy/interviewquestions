package com.test.iomedia;

public class OverridingTest {
public static void main(String[] args) {
	{
		new Child().show(1);
	}
}
}
class Parent{
	void show(int a){}
}
class Child extends Parent{
	void show(Integer a){
		System.out.println("HI I am in child class");
	}
	
}
