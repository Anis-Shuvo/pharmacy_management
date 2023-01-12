package com.exam.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exam.spring.models.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	@Query("select u from User u where u.userName=?1")
	 public List<User> search(String userName);
	@Query("select u From User u WHERE u.uEmail =:e and u.uPass=:p ")
	public List<User> getUserByUserName(@Param("e")String uEmail,@Param("p")String uPass);
}
