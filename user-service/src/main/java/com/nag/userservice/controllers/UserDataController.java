package com.nag.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.userservice.dtos.UserDataDto;
import com.nag.userservice.services.UserDataService;

@RestController
@RequestMapping("/user")
public class UserDataController {
	@Autowired
	UserDataService userDataService;

	@RequestMapping("/{userId}")
	public UserDataDto getUserData(@PathVariable Long userId, Model model) {
		return userDataService.getUserById(userId);
	}
}
