package com.test.boh.testapi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.boh.testapi.dto.RequestDTO;
import com.test.boh.testapi.dto.ResponseDTO;
import com.test.boh.testapi.dto.UserFilterQuery;
import com.test.boh.testapi.entity.SortBy;
import com.test.boh.testapi.entity.User;
import com.test.boh.testapi.services.GetUserServices;

@RestController
public class UserController {

	
	private GetUserServices services;
	
	@Autowired
	public UserController(GetUserServices services) {
		super();
		this.services = services;
	}
	

//	@GetMapping(path = "/getByFilters", consumes = "application/json", produces = "application/json")
	@PostMapping(path = "/getByFilters", consumes = "application/json", produces = "application/json")
	public List<ResponseDTO> UsersByFilter(@RequestBody RequestDTO userDTO, 
			@RequestParam(required = false, defaultValue = "3") int pageSize, 
			@RequestParam(required = false, defaultValue = "0") int offSet, 
			@RequestParam(required = false, defaultValue = "userID") SortBy sortBy) {

		User user = new User();
		
		BeanUtils.copyProperties(userDTO, user);
		UserFilterQuery userFilterQuery = new UserFilterQuery(userDTO, offSet, pageSize, sortBy);
		
		return services.getFilteredList(userFilterQuery);
	}
	
	
	@GetMapping(path = "/getAll", produces = "application/json")
	public List<ResponseDTO> allUsers() {
		return  services.getAll();
	}

}
