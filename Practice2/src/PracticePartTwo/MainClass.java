package PracticePartTwo;
import java.util.*;
import java.util.stream.*;
public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Swasti", 23000);
		Employee e2=new Employee(2, "Manya",10000);
		Employee e3=new Employee(3, "Srishti", 50000);
		Employee e4=new Employee(4, "Shreshth", 15000);
		Employee e5=new Employee(5, "Pragya", 30000);
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		
		
		list.stream().filter(e->e.getSalary()<20000).forEach(e->e.setSalary(e.getSalary()+5000));
		System.out.println(list);
		System.out.println(e2);

		

	}

}
