package ExceptionHandling;

public class Test {

	public static void main(String[] args) {

		
		
		System.out.println(print());

}
	public static int print() {
		try {
			int x=10/0;
			return 1;
		}catch (Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}
}
