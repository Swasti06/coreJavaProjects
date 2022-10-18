package InternBonusCalculation;

public class PythonIntern extends Intern implements DiwaliBonus{
	
	
	@Override
	public String toString() {
		return "PythonIntern [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+"]";
	}

	@Override
	void addBonus() {
		int newSal= super.getSalary()+diwaliBonus;
		super.setInternSalary(newSal);
	}

}
