package register;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class patientdbutill {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	 public static boolean insertpatient(String firstname, String surname, String gender, String address, String email, String connumber,
				String username, String password) {
	    	isSuccess = false;
	    	
	    	try {
	    		con = DBconnect.getConnection();
	    		stmt =con.createStatement();
	    	    String sql = "insert into patient values (0,'"+firstname+"','"+surname+"','"+gender+"','"+address+"','"+email+"','"+connumber+"','"+username+"','"+password+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	    
}
