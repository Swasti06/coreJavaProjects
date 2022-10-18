package com.practice.five;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(89);
		System.out.println(list);
		
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		Set<Integer> collect=list.stream().collect(Collectors.toSet());
		System.out.println(collect);
	}

}
