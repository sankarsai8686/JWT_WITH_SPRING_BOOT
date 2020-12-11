package com.sankar.tech.pro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sankar.tech.pro.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String username);

}
