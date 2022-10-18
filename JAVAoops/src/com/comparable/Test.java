package com.comparable;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("Swasti", 100);
		Student s2=new Student("Manya", 100);
		int compareTo=s1.compareTo(s2);
		System.out.println(compareTo);
	}

}
