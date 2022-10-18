package com.assessment.two;

import java.util.*;
import java.util.TreeMap;
import com.assessment.three.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "Swasti", 20000);
		Employee e2 = new Employee(2, "Manya", 10000);
		Employee e3 = new Employee(3, "Srishti", 2000);
		Employee e4 = new Employee(4, "Shreshth", 5000);
		Employee e5 = new Employee(5, "Pragya", 30000);

		Map<Employee, Integer> employeeMap = new TreeMap<>((x, y) -> x.getSalary() - y.getSalary());
		employeeMap.put(e1, 1);
		employeeMap.put(e2, 2);
		employeeMap.put(e3, 3);
		employeeMap.put(e4, 4);
		employeeMap.put(e5, 5);

		System.out.println(employeeMap);

	}

}
