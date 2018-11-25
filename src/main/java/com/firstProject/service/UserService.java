package com.firstProject.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.firstProject.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);
	
	UserDto getUserByUserId(String userId);
	
	UserDto getUser(String email);
	
	UserDto updateUser(String userId, UserDto user);
	
	void deleteUser(String userId);
	
	List<UserDto> getUsers(int page, int limit);
	
}
