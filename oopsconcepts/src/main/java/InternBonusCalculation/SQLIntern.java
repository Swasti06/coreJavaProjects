package InternBonusCalculation;

public class SQLIntern extends Intern implements DussheraBonus{
	
	
	
	@Override
	public String toString() {
		return "SQLIntern [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+  "]";
	}

	@Override
	void addBonus() {
		int newSal= super.getSalary()+dussheraBonus;
		super.setInternSalary(newSal);
	}

}
