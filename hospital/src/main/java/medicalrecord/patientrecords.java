package medicalrecord;

import java.util.Date;

public class patientrecords {
	Date date;
	String doctor;
	String diagnosis;
	String treatment;
	String notes;
	public patientrecords(Date date, String doctor, String diagnosis, String treatment, String notes) {

		this.date = date;
		this.doctor = doctor;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.notes = notes;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	

}
