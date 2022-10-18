package com.setsDemo;
import java.util.*;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Employee e1=new Employee("Swasti", 90);
		Employee e2=new Employee("Manya", 98);
		Employee e3=new Employee("Swasti", 100);
		
		Set<Employee> hset= new HashSet<>();
		hset.add(e1);
		hset.add(e2);
		System.out.println(hset);
	}

}
