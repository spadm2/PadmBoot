package com.airindia.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airindia.reserve.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
