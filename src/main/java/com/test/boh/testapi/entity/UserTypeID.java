package com.test.boh.testapi.entity;

public enum UserTypeID {
	UNDEFINED(0),
	FRONTEND_USER(1),
	BACKEND_USER(2);
	
	UserTypeID(int userID) {
		this.userID = userID;
	}

	public int getUserID() {
		return userID;
	}

	private int userID;
}
