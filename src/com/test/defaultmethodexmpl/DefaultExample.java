package com.test.defaultmethodexmpl;

public class DefaultExample implements Defaultinf {

	@Override
	public void show() {
		System.out.println("Implementation of abstract method");

	}
	public static void main(String[] args) {
		Defaultinf defaultinf=new DefaultExample();
		defaultinf.show();
		defaultinf.add(1, 3);
		
	}

}

interface Defaultinf {
	void show();

	default int add(int a, int b) {
		System.out.println(a+b);
		return a + b;

	}
}
