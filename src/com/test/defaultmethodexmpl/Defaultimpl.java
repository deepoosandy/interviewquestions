package com.test.defaultmethodexmpl;

public class Defaultimpl implements InterfaceD{
	public int add(int k, int i) {
		System.out.println("In class");
		return k + i;
	}
	public static void main(String[] args) {
		InterfaceD defaultimpl=new Defaultimpl();
		defaultimpl.add(4, 6);
		
		
	}
}

interface InterfaceD {
	default int add(int k, int i) {
		return k + i;
	}
}