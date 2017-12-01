package com.login.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.login.pojo.User;

@Repository
public interface LoginMapper {
	
	List<User> getUser();
}
