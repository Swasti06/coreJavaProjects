package OptionalDemo;
import java.util.*;

import com.Stream.Demo.InvalidException;

public class DemoOptional {
	public static void main(String[] args) {
		Optional<Employee> optional=Optional.ofNullable(getEmpObject());
		Employee emp=optional.orElseThrow(()-> new InvalidException());
		System.out.println(emp.getId());
		
	}
	private static Employee getEmpObject() {
		Employee e=new Employee(12,"Swasti",2222);
		Employee e1=null;
		return e1;
		}
	}

