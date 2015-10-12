package com.kdyzm.ssh.dao;

import com.kdyzm.ssh.doamin.User;

public interface UserDao {
	public User saveUser(User user);
	public User updateUser(User user);
	public User deleteUser(User user);
	public User getUserById(Long id);
}
