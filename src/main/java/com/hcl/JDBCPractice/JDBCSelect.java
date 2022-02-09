package com.hcl.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect {
	public static void JDBCSe() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println(rs.getInt("EmpID") + " " + rs.getString("EmpName") + " " + rs.getString("DOB")
						+ " " + rs.getString("Salary") + " " + rs.getString("Age"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
