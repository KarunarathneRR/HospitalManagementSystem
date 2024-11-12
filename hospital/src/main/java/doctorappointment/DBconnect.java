package doctorappointment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

		private static String url = "jdbc:mysql://localhost:3306/hospital";
		private static String userName = "root";
		private static String password = "12345678";
		private static Connection con;

		public static Connection getConnection() {
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url, userName, password);
				
			}
			catch (Exception e) {
				System.out.println("Database connection is not success!!!");
			}
			
			return con;
		}
	}






