package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.exam.spring.models.User;
import com.exam.spring.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	public void saveUser(User user) {
		ur.save(user);
	}
	public void updateUser(User user) {
		ur.save(user);
	}
	public void deleteUser(User user) {
		ur.delete(user);
	}
	public List<User> findAllUser(User user) {
		return ur.findAll();
	}
	public User findUserById(int uid) {
		return ur.findById(uid).get();
	}
	public List<User> searchByEmailPass(String uEmail,String uPass){
		return ur.getUserByUserName(uEmail, uPass);
	}

}
