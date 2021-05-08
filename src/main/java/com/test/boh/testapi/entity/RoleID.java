package com.test.boh.testapi.entity;

public enum RoleID {
		UNDEFINED(0),
		ADMIN(1),
		AGENT(2),
		BUYER(3);
	
	RoleID(int role) {
		this.role = role;
	}
	
	private int role;

		public int getRole() {
			return role;
		}
}
