package com.test.boh.testapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userID;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "ZIP_CODE")
	private String zipCode;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ROLE_ID")
	@Enumerated(EnumType.ORDINAL)
	private RoleID roleID;
	
	@Column(name = "USER_TYPE_ID")
	@Enumerated(EnumType.ORDINAL)
	private UserTypeID userTypeID;
	
	public User() {
	}

	public User(String firstName, String lastName, String emailAddress, String phoneNumber, String address,
			String zipCode, String state, RoleID roleID, UserTypeID userTypeID) {
		super();
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