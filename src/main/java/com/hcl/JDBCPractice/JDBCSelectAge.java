package com.hcl.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectAge {
	public static void JDBCSA() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select Age from Employee");
			while (rs.next()) {
				System.out.println(rs.getString("Age"));
		} 
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}

}
}