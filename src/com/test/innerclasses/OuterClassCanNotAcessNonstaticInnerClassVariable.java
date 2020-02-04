package com.test.innerclasses;

public class OuterClassCanNotAcessNonstaticInnerClassVariable {
	int p=10;
public class InnerClass{
	 int q=4;
}
public void show(){
	System.out.println(p);
	System.out.println(q);
}
}
