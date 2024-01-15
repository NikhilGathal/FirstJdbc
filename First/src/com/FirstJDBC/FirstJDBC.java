package com.FirstJDBC;

import java.sql.*;

public class FirstJDBC {

	public static void main(String[] args)throws SQLException {
		
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","nikhil77");
		System.out.println("Connection Established Successfully");
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from dept1");
		connection.close();
	}

}
