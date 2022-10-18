package com.interfaceJAVA8;

public interface Student{
	//abstract method
	void study();
	//static
	static void eat() {
		System.out.println("JAVA Student is eating");
	}
	//default method
	default void play() {
		System.out.println("Student is playing");
	}
}
