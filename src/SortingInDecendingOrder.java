import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInDecendingOrder {
public static void main(String[] args) {
	List<Integer>arr=new ArrayList<>();;
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	Collections.sort(arr, new MyComparator());
	System.out.println(arr);
}
}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o2>o1){
			return 1;
		}else if(o1>o2){
			return -1;
		}
		return 0;
	}
	
}