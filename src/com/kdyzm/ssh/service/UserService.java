package com.kdyzm.ssh.service;

import com.kdyzm.ssh.doamin.User;

public interface UserService {
	public User saveUser(User user);
	public User updateUser(User user);
	public User deleteUser(User user);
	public User getUserById(Long id);
}
