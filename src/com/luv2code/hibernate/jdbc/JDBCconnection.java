package com.luv2code.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {

	public static void main(String[] args) {
		String jdbcURL= "jdbc:mysql://127.0.0.1:3306/employee?useSSL=false";
		String username = "employee";
		String password = "employee";
		try {
			System.out.println("Connection to database: "+jdbcURL);
			Connection employeeConnection = DriverManager.getConnection(jdbcURL,username,password);	
			System.out.println("Connection is completed");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
