import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Sandeep");
		list.add("Kumar");
		list.add("Jaiswal");
		Iterator<String>ii=list.iterator();
		while(ii.hasNext()){
			System.out.println(ii.next());
			ii.remove();
		}
		System.out.println(list);
		
		
	}
}
