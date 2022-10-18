package com.properties;
import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class MainClass {

	public static void main(String[] args) throws ConfigurationException {
		// TODO Auto-generated method stub
		Configurations configuration=new Configurations();
		PropertiesConfiguration config=configuration.properties("ConfigurationProperties");
		System.out.println(config.getProperty("companyName"));
	}

}
