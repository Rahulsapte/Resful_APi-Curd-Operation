package com.nexus.main.services;

import java.util.List;
import java.util.Optional;

import com.nexus.main.entities.User;

public interface UserService {

	public User createUser(User user);

	public List<User> getAllUser();
	
	public Optional<User> getUserinfo(int id);
	
	public User updateUserinfo(int id , User user );

	public void deleteUser(int id);
}
