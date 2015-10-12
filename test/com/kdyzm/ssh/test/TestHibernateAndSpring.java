package com.kdyzm.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdyzm.ssh.doamin.User;
import com.kdyzm.ssh.service.UserService;
/*
 * ����Hibernate��Spring֮�������
 */
public class TestHibernateAndSpring {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService=(UserService) context.getBean("userService");
		User user=new User();
		user.setName("���");
		user.setAge(14);
		userService.saveUser(user);
	}
}
