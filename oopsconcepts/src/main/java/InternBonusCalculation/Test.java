package InternBonusCalculation;

public class Test {

	public static void main(String[] args) {
		JavaIntern i= new JavaIntern();
		i.setDetails(11, "Swasti", 1000);
		i.addBonus();
		System.out.println(i);
		
		PythonIntern p=new PythonIntern();
		p.setDetails(22, "Manya", 2000);
		p.addBonus();
		System.out.println(p);
		
		SQLIntern s=new SQLIntern();
		s.setDetails(33, "Shreshth", 3000);
		s.addBonus();
		System.out.println(s);
		
		DotNetIntern d=new DotNetIntern();
		d.setDetails(44, "Srishti", 4000);
		d.addBonus();
		System.out.println(d);
		
		SAPIntern sap=new SAPIntern();
		sap.setDetails(55, "Alia", 5000);
		sap.addBonus();
		System.out.println(sap);
		
		
		

	}

}
