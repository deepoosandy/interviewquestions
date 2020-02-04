package com.test.innerclasses;

public class OuterClassCanNotAcessStaticInnerClassVariableEitherItisStaticOrNonStatic {
	int i=10;
 public static class InnerClass{
	 int p=11;
 }
 public  void test() {
	System.out.println(i);
	System.out.println(p);
}
}
