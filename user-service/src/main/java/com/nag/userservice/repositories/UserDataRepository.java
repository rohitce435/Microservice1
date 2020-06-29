package com.nag.userservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nag.userservice.entities.UserData;

@Repository
public interface UserDataRepository extends CrudRepository<UserData, Long> {
}
