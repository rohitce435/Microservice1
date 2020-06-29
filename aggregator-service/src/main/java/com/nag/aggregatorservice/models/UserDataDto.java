package com.nag.aggregatorservice.models;

public class UserDataDto {
	private String name;
	private Long age;
	private String email;
	
	public UserDataDto() {
		super();
	}

	public UserDataDto(String name, Long age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
