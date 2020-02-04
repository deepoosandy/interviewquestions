import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		Employee e = null;
		for (int i = 0; i < 10; i++) {
			e = new Employee();
			e.age = 1;
			if (i < 3)
				e.name = "a";
			else if (i > 3 && i < 5)
				e.name = "b";
			else
				e.name = "c";
			list.add(e);
		}
		List<Employee> list2 = list.stream().filter(employee -> {
			if (Collections.frequency(list, employee) > 1) {
				// System.out.println(Collections.frequency(list, employee));
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		list2.forEach(l2 -> {
			// System.out.println(l2.name);
		});

		Map<String, List<Employee>> map = list2.stream().collect(Collectors.groupingBy(Employee::getName));
		map.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("Value: " + v);

		});

		Double avergaeAge = list.stream().collect(Collectors.averagingDouble(Employee::getAge));
		System.out.println("Averaging age: " + avergaeAge);

		System.out.println(list.stream().distinct().count());

		TreeMap<String, List<Employee>> map1 = list.stream()
				.collect(Collectors.groupingBy(Employee::getName, TreeMap::new, Collectors.toList()));
		List<Employee> elist=list.stream().filter(x->
		{
			int count=0;
			if((
					list.stream().anyMatch(e1->e1.name.equalsIgnoreCase(x.getName()))
					)){
				count++;
				x.setName(x.name+count);
				return true;
			}else{
				return false;
			}
			
		}).collect(Collectors.toList());
		elist.forEach(name->{
			System.out.println(name.getName());
		});
	
	}
	
}

class Employee {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	String name;
	int age;
}