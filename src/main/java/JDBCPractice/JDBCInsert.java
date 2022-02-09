package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {
	public static void JDBCI() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sherlockholmes");
		Statement stmt = conn.createStatement();
		
		String sql = "insert into employee" +" (EmpID, EmpName, DOB, Salary, Age)" + " values('1', 'Tin Truong', '10/18/1995', '70000', '26')";
		
		stmt.executeUpdate(sql);
		System.out.println("Finish");	
			
		}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}



