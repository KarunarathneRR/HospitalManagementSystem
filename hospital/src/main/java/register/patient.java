package register;

public class patient {
	String firstname;
	String surname;
	String gender;
	String address;
	String email;
	String connumber;
	String username;
	String password;

	public patient(String firstname, String surname, String gender, String address, String email, String connumber,
		String username, String password) {

	this.firstname = firstname;
	this.surname = surname;
	this.gender = gender;
	this.address = address;
	this.email = email;
	this.connumber = connumber;
	this.username = username;
	this.password = password;
}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConnumber() {
		return connumber;
	}

	public void setConnumber(String connumber) {
		this.connumber = connumber;
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
