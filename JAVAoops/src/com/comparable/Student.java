package com.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private Integer marks;
	
	public Student(String sname, int smarks) {
		super();
		this.name=sname;
		this.marks=smarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks.compareTo(o.marks);
	}

}
