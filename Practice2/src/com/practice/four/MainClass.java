package com.practice.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import PracticePartTwo.Employee;
import java.util.*;

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
		
		
//		System.out.println(Collections.max(list,(x,y)->x.getId()-y.getId()));
		Collections.sort(list,Collections.reverseOrder((x,y)->x.getSalary()-y.getSalary()));
		System.out.println(list);
		
//		List<Integer> newList=new ArrayList<>();
//		newList.add(23);
//		newList.add(56);
//		newList.add(32);
//		newList.add(34);
//		newList.add(89);
//	
//		Collections.sort(newList,Collections.reverseOrder());
//		System.out.println(newList);

	}

}
