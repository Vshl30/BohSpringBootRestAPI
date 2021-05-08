package com.test.boh.testapi.dto;

import com.test.boh.testapi.entity.SortBy;

public class UserFilterQuery {
	
	private RequestDTO userDTO;
	
	private int offset;
	
	private int size;
	
	private SortBy sortBy;
	
	@SuppressWarnings("unused")
	private UserFilterQuery() {
		
	}
	
	public UserFilterQuery(RequestDTO userDTO, int offset, int size, SortBy sortBy) {
		super();
		this.userDTO = userDTO;
		this.offset = offset;
		this.size = size;
		this.sortBy = sortBy;
	}

	public RequestDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(RequestDTO userDTO) {
		this.userDTO = userDTO;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SortBy getSortBy() {
		return sortBy;
	}

	public void setSortBy(SortBy sortBy) {
		this.sortBy = sortBy;
	}
}
