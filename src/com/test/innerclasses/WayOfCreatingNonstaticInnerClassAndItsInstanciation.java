package com.test.innerclasses;

public class WayOfCreatingNonstaticInnerClassAndItsInstanciation {

	public class InnerClass{
		
	}
	public static void main(String[] args) {
		InnerClass innerclass=new WayOfCreatingNonstaticInnerClassAndItsInstanciation().
				new InnerClass();
	}
}
