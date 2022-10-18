package dynamicBinding;

public class Test {
	public static void main(String[] args) {
		Animal a=new Lion();
		a.eat();
		a.sleep();
		
		Lion l=new Lion();
		l.eat();
		l.sleep();
		
	}

}
