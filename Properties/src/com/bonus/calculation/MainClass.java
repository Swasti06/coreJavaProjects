package com.bonus.calculation;
import java.util.Iterator;

import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class MainClass {

	public static void main(String[] args) throws ConfigurationException {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "Swasti", 23000);
		Employee e2=new Employee(2, "Manya", 20000);

		Configurations configuration = new Configurations();
		PropertiesConfiguration config = configuration.properties("BonusValue");
		int bonus = config.getInt("bonus");
		e1.setSalary(e1.getSalary()+bonus);
		System.out.println(e1);
		
		//config.getProperty returns an object
		
		//Following is the downcasting method
		Integer s=Integer.parseInt((String) config.getProperty("bonus"));
		e2.setSalary(e2.getSalary()+s);
		System.out.println(e2);
		

	}

}
