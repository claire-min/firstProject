package com.firstProject.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.firstProject.io.entity.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
	
	UserEntity findByUserId(String userId);
	
	UserEntity findByEmail(String email);
	
	UserEntity findUserByEmailVerificationToken(String token);
	
}
