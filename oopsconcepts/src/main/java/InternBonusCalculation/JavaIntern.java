package InternBonusCalculation;

public class JavaIntern extends Intern implements DussheraBonus{


	@Override
	public String toString() {
		return "JavaIntern [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ "]";
	}

	@Override
	void addBonus() {
		int newSal= super.getSalary()+dussheraBonus;
		super.setInternSalary(newSal);
	}
	
	
	
}
