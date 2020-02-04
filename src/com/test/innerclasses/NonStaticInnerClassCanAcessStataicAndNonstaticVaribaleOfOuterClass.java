package com.test.innerclasses;

public class NonStaticInnerClassCanAcessStataicAndNonstaticVaribaleOfOuterClass {
	int outerVariable=1;
	static int staticOuterVariable=10;
   public class InnerClass{
	   int innervaribale=10;
	   public void test(){
		   System.out.println(innervaribale);
		   System.out.println(outerVariable);
		   System.out.println(staticOuterVariable);
	   }
   }
}
