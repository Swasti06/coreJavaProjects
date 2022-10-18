package InternBonusCalculation;

public abstract class Intern {
	private int internId;
	private String internName;
	private int internSal;
	
	void setDetails(int id, String name, int salary) {
		this.internId=id;
		this.internName=name;
		this.internSal=salary;
	}
	
	void setInternSalary(int salary) {
		this.internSal=salary;
	}
	
	public int getId() {
		return internId;
	}
	public String getName() {
		return internName;
	}
	public int getSalary() {
		return internSal;
	}
	
	abstract void addBonus();
		
	
	
}
