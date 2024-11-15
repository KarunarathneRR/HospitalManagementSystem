package medicalrecord;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import register.DBconnect;

public class medicalrecorddbutill {
	


	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    public static List<medicalrecords> getmedicalrecords(String patientId) {
    	
    	int patientId1 = Integer.parseInt(patientId);
    	
    	ArrayList<medicalrecords> mr = new ArrayList<>();
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from medicalrecords where patientId='"+patientId1+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int patientID = rs.getInt(1);
    			String Date = rs.getString(2);
    			String Doctor = rs.getString(3);
    			String Diagnosis = rs.getString(4);
    			String Treatement = rs.getString(5);
    			String Notes = rs.getString(6);
    			
    			medicalrecords m = new medicalrecords(patientID,Date,Doctor,Diagnosis,Treatement,Notes);
    			mr.add(m);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return mr;	
    }
    
public static List<patientrecords> getpatientrecords(String patientId) {
    	
    	int patientId1 = Integer.parseInt(patientId);
    	
    	ArrayList<patientrecords> pr = new ArrayList<>();
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from medicalrecords where patientId='"+patientId1+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			//int patientID = rs.getInt(1);
    			Date Date = rs.getDate(1);
    			String Doctor = rs.getString(2);
    			String Diagnosis = rs.getString(3);
    			String Treatement = rs.getString(4);
    			String Notes = rs.getString(5);
    			
    			patientrecords p = new patientrecords(Date,Doctor,Diagnosis,Treatement,Notes);
    			pr.add(p);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return pr;	
    }

private static boolean isSuccess;


 public static boolean insertpatientrecords(String date, String patientname, String diagnosis, String treatements, String notes) {
    	isSuccess = false;
    	
    	try {
    		con = DBconnect.getConnection();
    		stmt =con.createStatement();
    	    String sql = "insert into medicalrecords values (0,'"+date+"','"+patientname+"','"+diagnosis+"','"+treatements+"','"+notes+"')";
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
