package com.test.boh.testapi.entity;

public enum SortBy {
	  FIRST_NAME("firstName"),
	  LAST_NAME("lastName"),
	  EMAIL_ADDRESS("emailAddress"),
	  ADDRESS("address"),
	  COUNTRY("country"),
	  ZIP_CODE("zipCode"),
	  STATE("state"),
	  PHONE_NUMBER("phoneNumber");
	
	private String sortBy;

	SortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String getSortBy() {
		return sortBy;
	}

}
