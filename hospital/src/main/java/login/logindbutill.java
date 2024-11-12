package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import register.DBconnect;

public class logindbutill {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username,String password) {
		try {
			con = DBconnect.getConnection();
    		stmt =con.createStatement();
    	    String sql = "select * from patient where username='"+username+"' and password='"+password+"'";
    		int rs = stmt.executeUpdate(sql);
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	

}
