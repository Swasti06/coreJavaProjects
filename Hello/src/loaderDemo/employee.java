package loaderDemo;

public class employee {
	int id;
	String name;
	double sal;
	employee(int ide, String names, double salary){
		id=ide;
		name=names;
		sal=salary;
	}
	void deductedsal() {
		this.sal= this.sal-(0.01*this.sal);
		System.out.println(sal);
	}
	
}
