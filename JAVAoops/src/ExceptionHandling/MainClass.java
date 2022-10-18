package ExceptionHandling;

public class MainClass  {
	public static void main(String[] args) {
		
	try {
		Employee e= getEmp();
		int num=10/0;
		e.print();
	}catch(NullPointerException e) {
		System.out.println("Null Pointer Exception");
	}
	catch (Exception e) {
		System.out.println("Any other Exception");
	}
	System.out.println("Program executed");

}

private static Employee getEmp() {
	Employee e =null;
	return e;
}
}
