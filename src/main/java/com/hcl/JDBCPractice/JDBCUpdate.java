package com.hcl.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdate {
	public static void JDBCUp() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
			Statement stmt = conn.createStatement();
			String sql = "update Employee " + "set Salary = '100000'" + "where EmpID = 1";
			stmt.executeUpdate(sql);
			System.out.println("Finish");
		} catch (Exception e) {
			e.printStackTrace();
	}

}
}