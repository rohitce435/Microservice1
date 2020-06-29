package com.nag.userservice.services;

import org.springframework.stereotype.Service;

import com.nag.userservice.dtos.UserDataDto;

@Service
public interface UserDataService {

	public UserDataDto getUserById(Long id);
}
