package com.test.innerclasses;

public class WayOfCreatingStaticInnerClassAndItsInstanciation {
 static class InnerClass{
	 
 }
 public static void main(String[] args) {
	InnerClass c=new InnerClass();
	InnerClass c1=new WayOfCreatingStaticInnerClassAndItsInstanciation.InnerClass();
}
}
