package com.test.cbre;

public class DefaultmMethodTest implements A,B {
	
public static void main(String[] args) {
	new DefaultmMethodTest().test();
}

@Override
public void test() {
	B.super.test();
}
}

interface A{
	default void test(){
		System.out.println("I am in the interface A");
	}
}

interface B{
	default void test(){
		System.out.println("I am in the interface B");
	}
}
