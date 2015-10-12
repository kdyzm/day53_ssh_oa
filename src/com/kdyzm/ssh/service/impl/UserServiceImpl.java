package com.kdyzm.ssh.service.impl;

import com.kdyzm.ssh.dao.UserDao;
import com.kdyzm.ssh.doamin.User;
import com.kdyzm.ssh.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User saveUser(User user) {
		/*User user=new User();
		user.setName("¥Ûª∆");
		user.setAge(8);
		userDao.saveUser(user);
//		int a=1/0;
		User userTest=new User();
		userTest.setName(" ¬ŒÒ≤‚ ‘£°");
		userTest.setAge(18);
		userDao.saveUser(userTest);*/
		return userDao.saveUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User deleteUser(User user) {
		return userDao.deleteUser(user);
	}

	@Override
	public User getUserById(Long id) {
		User user=userDao.getUserById(id);
//		System.out.println("UserService:"+user);
		return user;
	}

}
