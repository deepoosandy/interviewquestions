package com.test.cbre;

public class IsEvenOrOdd {
public static void main(String[] args) {
	for(int i=0;i<10000;i++)
	IsEvenOrOdd.isEvenOrOdd(i);
}
private static void isEvenOrOdd(int number){
	if((number & 1)==0){
	 System.out.println("Given number is even : "+number);	
	}else{
		 System.out.println("Given number is odd : "+number);	
}
}
}
