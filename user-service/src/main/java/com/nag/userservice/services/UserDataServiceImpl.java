package com.nag.userservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nag.userservice.dtos.UserDataDto;
import com.nag.userservice.entities.UserData;
import com.nag.userservice.repositories.UserDataRepository;

@Service
public class UserDataServiceImpl implements UserDataService{
	@Autowired
	private UserDataRepository userDataRepository;

	@Override
	public UserDataDto getUserById(Long id) {
		Optional<UserData> data = userDataRepository.findById(id);
		if(data.isPresent()) {
			return new UserDataDto(data.get().getName(), data.get().getAge(), data.get().getEmail());	
		}else {
			return null;
		}
	}
	
}
