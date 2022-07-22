package com.cgi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	
}
