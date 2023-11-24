package com.hospital.dto;



public class HospitalDto {
private long id;
	
	
	private String firstName;
	
	
	private String lastName;
	

	private String city;
	
	
	private String email;
	
	
	private long mobile;
	

	private float fees;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public float getFees() {
		return fees;
	}


	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
}
