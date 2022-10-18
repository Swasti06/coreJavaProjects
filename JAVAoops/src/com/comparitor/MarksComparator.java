package com.comparitor;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks().compareTo(o2.getMarks());
	}

}
