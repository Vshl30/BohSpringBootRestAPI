package com.test.boh.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.boh.testapi.dto.RequestDTO;
import com.test.boh.testapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
