package collectionsJAVA;
import java.util.*;

public class MainHashMap {
	public static void main(String[] args) {
		Map<student,String> demoHash= new HashMap<>();
		student s1=new student(1, "Swasti", 90);
		student s2=new student(2, "Manya", 95);
		student s3=new student(3, "Aakriti", 100);
		student s4=new student(4, "Aarushi", 80);

		demoHash.put(s1,"DPS");
		demoHash.put(s2,"Apeejay");
		demoHash.put(s3,"Sachdeva");
		demoHash.put(s4,"GD Goenka");

		System.out.println(demoHash);
		
	}

}
