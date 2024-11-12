package scheduleappointment;

public class appointment {
	String doctor;
	String patientname;
	String date;
	public appointment(String doctor, String patientname, String date) {
	
		this.doctor = doctor;
		this.patientname = patientname;
		this.date = date;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
