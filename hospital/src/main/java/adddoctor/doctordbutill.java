package adddoctor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class doctordbutill {

		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;

		 public static boolean insertdoctort(String doctorname, String specification, String username, String password) {
		    	isSuccess = false;
		    	
		    	try {
		    		con = DBconnect.getConnection();
		    		stmt =con.createStatement();
		    	    String sql = "insert into doctor values (0,'"+doctorname+"','"+specification+"','"+username+"','"+password+"')";
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
