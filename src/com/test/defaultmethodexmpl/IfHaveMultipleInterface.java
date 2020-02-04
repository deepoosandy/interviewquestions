package com.test.defaultmethodexmpl;
//We can override default methods
//if we have two interface having same default methods (with same name) then if a class 
//implementing both interfaces then that concrete class have to override that default method else
// we will get compile time error. And below would be the way e.g
/*
 * @Override
	public int getCalculatedNumber(int a, int b) {
		
		return InterfaceB.super.getCalculatedNumber(a, b);
	}
	which interface you want to use give its name . super. that method
 * 
 * 
 * */
// have to overstr


public class IfHaveMultipleInterface implements InterfaceA{

	@Override
	public int getCalculatedNumber(int a, int b) {
		System.out.println("In the concreate Mthod");
		return a+b-1;//InterfaceB.super.getCalculatedNumber(a, b);
	}
	
	public static void main(String[] args) {
		InterfaceA interfacea=new IfHaveMultipleInterface();
		interfacea.getCalculatedNumber(2, 3);
	}

}

interface InterfaceA {
	default int getCalculatedNumber(int a, int b) {
		int d = a + b;
		System.out.println("In interface A : " + d);
		return d;
	}
}
interface InterfaceB{
	default int getCalculatedNumber(int a, int b) {
		int d = a *b;
		System.out.println("In interface B : " + d);
		return d;
	}
}