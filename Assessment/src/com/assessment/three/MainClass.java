package com.assessment.three;

import java.util.HashSet;
import java.util.Set;


public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Swasti", 20000);
		Employee e2=new Employee(2, "Manya",10000);
		Employee e3=new Employee(3, "Srishti", 2000);
		Employee e4=new Employee(4, "Shreshth", 5000);
		Employee e5=new Employee(5, "Pragya", 30000);
		
		Set<Employee> employeeSet= new HashSet<>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		
		employeeSet.stream().filter(e->e.getSalary()<10000).forEach(e->e.setSalary(e.getSalary()+5000));
		System.out.println(employeeSet);



	}

}
