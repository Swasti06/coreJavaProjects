package collectionsJAVA;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		student s1=new student(1, "Swasti", 90);
		student s2=new student(2, "Manya", 95);
		student s3=new student(3, "Aakriti", 93);

		
		List<student> listOfStudents= new LinkedList<>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);

		System.out.println(listOfStudents);


	}

}
