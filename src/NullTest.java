
public class NullTest {
public static void main(String arg[]){
	MethodHave methodHave =new MethodHave();
	Integer intr=null;
	methodHave.show(intr);
}
	
}
class MethodHave{
	public void show(String str){
		System.out.println("In String");
	}
	public void show(Integer intr){
		System.out.println("In Integer");
	}
}