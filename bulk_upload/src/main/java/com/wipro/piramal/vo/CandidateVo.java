package com.wipro.piramal.vo;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

import com.wipro.piramal.validator.NotNullNumberFormat;

/**
 * @author Praveen $oni
 */
@Component
public class CandidateVo {

	@NumberFormat
	private long identifier;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	@NumberFormat
	private long zip;
	private String residence;

	private String primaryNumber;
	@NumberFormat
	private long cellularNumber;
	
	@NotNullNumberFormat
	private long homeNumber;
	@Email(message = "Please enter proper email id")
	private String email;
	@NumberFormat
	private long noticePeriod;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private String dob;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private String doa;
	@NumberFormat
	private long rehire;
	@NumberFormat
	private long salary;
	@NumberFormat
	private long sal;

	public long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(long identifier) {
		this.identifier = identifier;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getPrimaryNumber() {
		return primaryNumber;
	}

	public void setPrimaryNumber(String primaryNumber) {
		this.primaryNumber = primaryNumber;
	}

	public long getCellularNumber() {
		return cellularNumber;
	}

	public void setCellularNumber(long cellularNumber) {
		this.cellularNumber = cellularNumber;
	}

	public long getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(long homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(long noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoa() {
		return doa;
	}

	public void setDoa(String doa) {
		this.doa = doa;
	}

	public long getRehire() {
		return rehire;
	}

	public void setRehire(long rehire) {
		this.rehire = rehire;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

}
