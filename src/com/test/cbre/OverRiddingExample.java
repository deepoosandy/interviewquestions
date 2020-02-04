package com.test.cbre;

public class OverRiddingExample {

	public Object add(){
		System.out.println("In the parent");
		return null;
	}
	
	public int  add(int k){
		System.out.println("In the parent add with argument : k= "+k);
		return 0;
	}
	public static void main(String[] args) {
		OverRiddingExample overRiddingExample=new  child();
		overRiddingExample.add();
		Integer i=new Integer(4);
		overRiddingExample.add(i);
	}
}
class child extends OverRiddingExample{
	public String add()  {
		System.out.println("In the child");
		return null;
	}
	
	public int  add(Integer i){
		System.out.println("In the parent add with argument with Integer : i= "+i);
		return 0;
	}
}
