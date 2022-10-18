package com.comparitor;

public class Student{
	private String name;
	private Integer marks;
	
	public Student(String sname, int smarks) {
		super();
		this.name=sname;
		this.marks=smarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	
}
