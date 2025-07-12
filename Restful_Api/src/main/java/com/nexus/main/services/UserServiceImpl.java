package com.nexus.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.main.entities.User;
import com.nexus.main.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public User createUser(User user) {

		return userrepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
	
		return userrepository.findAll();
	}

	@Override
	public Optional<User> getUserinfo(int id) {
	
		return userrepository.findById(id);
	}

	@Override
	public User updateUserinfo(int id, User newUser) {
	
		User userData =	userrepository.findById(id).orElse(null);
	
		if (userData != null) {
		
			return userrepository.save(newUser);
		}
		else {
		  throw new RuntimeException("User not found with :"+id);
		}
}

	@Override
	public void deleteUser(int id) {
		
		userrepository.deleteById(id);
		
	}

}
