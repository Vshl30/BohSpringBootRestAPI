package com.test.boh.testapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.boh.testapi.entity.RoleID;
import com.test.boh.testapi.entity.UserTypeID;

public class RequestDTO {
	
	@JsonProperty(value = "user_id")
	private Long userID;

	@JsonProperty(value = "first_name")
	private String firstName;

	@JsonProperty(value = "last_name")
	private String lastName;

	@JsonProperty(value = "email_address")
	private String emailAddress;

	@JsonProperty(value = "phone_number")
	private String phoneNumber;

	@JsonProperty(value = "address")
	private String address;

	@JsonProperty(value = "zip_code")
	private String zipCode;

	@JsonProperty(value = "state")
	private String state;

	@JsonProperty(value = "role")
	private RoleID roleID;
	
	@JsonProperty(value = "user_type")
	private UserTypeID userTypeID;	

	public RequestDTO() {
		
	}
	
	public RequestDTO(Long userID, String firstName, String lastName, String emailAddress, String phoneNumber,
			String address, String zipCode, String state, RoleID roleID, UserTypeID userTypeID) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.zipCode = zipCode;
		this.state = state;
		this.roleID = roleID;
		this.userTypeID = userTypeID;
	}
	
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RoleID getRoleID() {
		return roleID;
	}

	public void setRoleID(RoleID roleID) {
		this.roleID = roleID;
	}

	public UserTypeID getUserTypeID() {
		return userTypeID;
	}

	public void setUserTypeID(UserTypeID userTypeID) {
		this.userTypeID = userTypeID;
	}

}
