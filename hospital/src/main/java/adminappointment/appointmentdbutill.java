package adminappointment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class appointmentdbutill {
	static boolean isSuccess ;
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
  public static boolean validate() {
	
	
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from appointment";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
  }
  public static boolean upadteappointment(String appointmentId,String doctor,String pname,String date) {
	  try {
		  con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "update appointment set doctor='"+doctor+"',patientname='"+pname+"',date='"+date+"'" + "where appointmentID='"+appointmentId+"'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
	  }catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
  }
  public static List<appointment> getdetails(){
	  ArrayList<appointment> ap=new ArrayList<>();
	  
	
			try {
	    		
	    		con = DBconnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select appointmentid,doctorname,pname,date from appointment ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			String doctor = rs.getString(1);
	    			String pname = rs.getString(2);
	    			String date = rs.getString(3);
	    			
	    			appointment c = new appointment(doctor,pname,date);
	    			ap.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	 
	  
	  return ap;
  }
  public static boolean deleteappointment(String id) {
	  try {
  		
  		con = DBconnect.getConnection();
  		stmt = con.createStatement();
  		String sql = "delete  from appointment where appointmentId='"+id+"'";
  		rs = stmt.executeQuery(sql);
  		if (rs.next()) {
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


