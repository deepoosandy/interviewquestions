
interface MyInterface {
	   int i = 10;
	

}

public class MyClass extends MyAbstract implements MyInterface {
	public static void main(String[] args) {
	
		System.out.println(i);
		System.out.println(j);
		MyClass.test();
		MyAbstract.test();
		test();
		MyClass myClass=new MyClass();
		myClass.show();
		
		MyAbstract myAbstract=new MyClass();
		myAbstract.show();
		myAbstract.display();
		
		MyParentClass myParentClass=new MyChildClass();
		myParentClass.display();
		MyParentClass myParentClass1=new MyParentClass();
		myParentClass1.display();
		
	}
	//Method hiding not overriding
	public static void test(){
		System.out.println("In the MyClass1 test ");
	}
	public  void show(){
		System.out.println("In the MyClass2 show");
	}
}
class MyParentClass {
	public void display(){
		System.out.println("MyParentClass");
	}
}
class MyChildClass extends MyParentClass{
	
	@Override
	public void display(){
		System.out.println("ChildClass");
	}
}


abstract class MyAbstract{
	public static final   int j = 10;
	int k;
	MyAbstract(){
		k=50;
	}
	public static void test(){
		System.out.println("In the abstacrt MyAbstract1 class");
	}
	
	public  void show(){
		System.out.println("In the abstacrt MyAbstract2 class");
	}
	public  void display(){
		System.out.println("In the abstacrt MyAbstract3 class");
	}
	
}