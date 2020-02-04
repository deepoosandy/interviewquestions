package com.test.innerclasses;

public class StaticinnerCanAccessStaticMembersOfOuterClass {
int outerVariable=10;
static int staticOuterVariable=10;

 public static class InnerClass{
	 int innerVariable=9;
	 public void test(){
		 System.out.println(innerVariable);
		 System.out.println(outerVariable);
		 System.out.println(staticOuterVariable);
	 }
 }
}
