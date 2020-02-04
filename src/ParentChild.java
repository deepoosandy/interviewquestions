
public class ParentChild {

	public static void main(String arg[]) {
		ParentChild parentChild1 = new Child();// upcasting
		ParentChild parentChild2 = new ParentChild();
		//Child c=new ParentChild(); this is downcasting which is not possible
		parentChild1.show();
		parentChild2.show();
	}

	public void show() {
		System.out.println("I am in Parent class");
	}
}

class Child extends ParentChild {
	@Override
	public void show() {
		System.out.println("I am in Child class");
	}
}