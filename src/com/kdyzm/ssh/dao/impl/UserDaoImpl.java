package com.kdyzm.ssh.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.kdyzm.ssh.dao.UserDao;
import com.kdyzm.ssh.doamin.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public User saveUser(User user) {
		hibernateTemplate.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		hibernateTemplate.update(user);
		return user;
	}

	@Override
	public User deleteUser(User user) {
		hibernateTemplate.delete(user);
		return user;
	}

	@Override
	public User getUserById(Long id) {
		User user=(User) hibernateTemplate.load(User.class, id);
//		System.out.println("userDaoImpl:"+user);
		return user;
	}

}
