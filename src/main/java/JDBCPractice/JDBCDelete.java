package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDelete {
	public static void JDBCDel() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
			Statement stmt = conn.createStatement();
			
			String sql = "Delete from employee where EmpID = 1";
			stmt.executeUpdate(sql);
			System.out.println("Finish");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}