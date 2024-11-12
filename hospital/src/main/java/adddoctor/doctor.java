package adddoctor;

public class doctor {
	String doctorname;
	String specialization;
	String username;
	String password;
	public doctor(String doctorname, String specialization, String username, String password) {
		
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.username = username;
		this.password = password;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
