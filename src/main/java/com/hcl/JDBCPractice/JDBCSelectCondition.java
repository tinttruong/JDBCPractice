package com.hcl.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectCondition {
	public static void JDBCSelectCond() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee where Salary >5000 and EmpName like 'B%' and age >21");
			while (rs.next()) {
				System.out.println(rs.getInt("EmpID") + " " + rs.getString("EmpName") + " " + rs.getString("DOB")
						+ " " + rs.getString("Salary") + " " + rs.getString("Age"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
