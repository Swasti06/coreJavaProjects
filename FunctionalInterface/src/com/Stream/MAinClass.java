package com.Stream;

import java.util.*;

import java.util.stream.Collectors;

public class MAinClass {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Swasti");
		list.add("Manya");
		list.add("Aakrti");
		list.add("Aarushi");
		list.add("Srishti");
		
		List<String> collect = list.stream().filter((e)->(e.equals("Manya"))).collect(Collectors.toList());
		System.out.println(collect);
	}

}
