package InternBonusCalculation;

public class SAPIntern extends Intern implements DussheraBonus{
	
	
	
	@Override
	public String toString() {
		return "SAPIntern [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ "]";
	}

	@Override
	void addBonus() {
		int newSal= super.getSalary()+dussheraBonus;
		super.setInternSalary(newSal);
	}

}
