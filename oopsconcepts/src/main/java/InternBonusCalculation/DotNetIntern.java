package InternBonusCalculation;

public class DotNetIntern extends Intern implements DiwaliBonus{
	
	
	

	@Override
	public String toString() {
		return "DotNetIntern [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+  "]";
	}
	
	@Override
	void addBonus() {
		int newSal= super.getSalary()+diwaliBonus;
		super.setInternSalary(newSal);
	}
}
