package com.assessment.four;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PassportDatabase {

	public void savedData(String name,int age, String nationality) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/telus_new","root","root");
			String sql="insert into ApplicantDetails(name,age,nationality) values(?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, age);
			preparedStatement.setString(3, nationality);
			preparedStatement.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
