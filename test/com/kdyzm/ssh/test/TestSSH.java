package com.kdyzm.ssh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdyzm.ssh.dao.UserDao;
import com.kdyzm.ssh.doamin.User;
import com.kdyzm.ssh.service.UserService;

public class TestSSH {
	private static SessionFactory sessionFactory;
	static{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate/hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();
	}
	@Test
	public void testHibernate(){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		User user=new User();
		user.setName("С��");
		user.setAge(8);
		session.save(user);
		
		transaction.commit();
		session.close();
	}
	
	//�Ȳ���DAO
	//�÷���һ���ᱨ���쳣
	@Test
	public void testDao(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserDao userDao=(UserDao) context.getBean("userDao");
		User user=userDao.getUserById(1L);
		System.out.println(user);
	}
	
	//������Ϊ�����ԭ��
	@Test
	public void testGet(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService=(UserService) context.getBean("userService");
		User user=userService.getUserById(1L);
		System.out.println("testGet:"+user);
	}
	
	@Test
	public void testTransaction(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService=(UserService) context.getBean("userService");
		User user1=new User();
		user1.setName("����");
		user1.setAge(1);
		userService.saveUser(user1);
		int a=1/0;
		User user2=new User();
		user2.setAge(2);
		user2.setName("����");
		userService.saveUser(user2);
	}
}
