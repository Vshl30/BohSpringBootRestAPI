package com.test.boh.testapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.test.boh.testapi.dto.ResponseDTO;
import com.test.boh.testapi.dto.UserFilterQuery;
import com.test.boh.testapi.entity.User;
import com.test.boh.testapi.repository.UserRepository;

@Service
public class GetUserServices {

	private UserRepository userRepository;

//	@SuppressWarnings("unused")
//	private Services() {
//		
//	}

	@Autowired
	public GetUserServices(UserRepository userRepository) {
//		super();
		this.userRepository = userRepository;
	}

	public List<ResponseDTO> getFilteredList(UserFilterQuery userFilterQuery) {
		User user = new User();
		BeanUtils.copyProperties(userFilterQuery.getUserDTO(), user);

		Example<User> userExaple = Example.of(user);
		Sort sortByField = Sort.by(userFilterQuery.getSortBy().getSortBy());
		PageRequest pageRequest = PageRequest.of(userFilterQuery.getOffset(), userFilterQuery.getSize(), sortByField);
		
		return userRepository.findAll(userExaple, pageRequest).stream().map(this::getResponseDTO).collect(Collectors.toList());
	}

	public List<ResponseDTO> getAll() {
		return userRepository.findAll().stream().map(this::getResponseDTO).collect(Collectors.toList());
	}
	
	
	private ResponseDTO getResponseDTO(User user) {
		 ResponseDTO responseDTO = new ResponseDTO();
		 BeanUtils.copyProperties(user, responseDTO);
		 return responseDTO;
	}

}
