package com.properties;
import java.util.Iterator;
import org.apache.commons.configuration2.PropertiesConfiguration;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		PropertiesConfiguration config=configuration.properties("configuration.properties")
		System.out.println(config.getProperty("name"));
	}

}
