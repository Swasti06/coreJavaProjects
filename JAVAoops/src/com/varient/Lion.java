package com.varient;

public class Lion extends Animal {
	public Lion roar() {
		System.out.println("Lion is roaring");
		return new Lion();
	}
}
