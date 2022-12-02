package com.project.rffc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.rffc.entity.User;
import com.project.rffc.repo.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		
		User checkUser = userRepository.findByUsername(user.getUsername());
		if(checkUser!=null) {
			
		} else {
			return userRepository.save(user);
		}
		return null;
	}

}
