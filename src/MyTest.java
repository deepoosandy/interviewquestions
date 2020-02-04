public class MyTest {
	public static void main(String arg[]) {
		MyTestInterface myTestInterface=null;
		
		MyTestClass myTestClass=null;
		MyTestInterface.show();
		MyTestClass.show();
		myTestClass.show();
		myTestClass.show1();
	}
}

interface MyTestInterface {
	static void show() {
		System.out.println("I am a static method in an Interface");
	}
}
class MyTestClass{
	public static void show() {
		System.out.println("I am a static method in  MyTestClass");
	}
	public  void show1() {
		System.out.println("I am a non static method in  MyTestClass1");
	}
}
