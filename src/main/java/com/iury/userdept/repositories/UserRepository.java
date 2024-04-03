package com.iury.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iury.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
