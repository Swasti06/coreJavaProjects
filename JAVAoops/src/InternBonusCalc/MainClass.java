package InternBonusCalc;

public class MainClass {

	public static void main(String[] args) {
		
		JavaIntern j=new JavaIntern();
		j.setDetails(1, "Swasti", 1000);
		j.addBonus();
		System.out.println(j);

	}

}
