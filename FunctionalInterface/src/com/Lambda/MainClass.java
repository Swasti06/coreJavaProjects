package com.Lambda;

public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Swasti", 300);
		Employee e2=new Employee(2, "Manya", 900);
		
		Comparator<Employee> comp=(x,y)->(x.getName().compareTo(y.getName()));
	}

}
