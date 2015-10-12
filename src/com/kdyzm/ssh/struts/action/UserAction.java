package com.kdyzm.ssh.struts.action;

import org.apache.struts2.ServletActionContext;

import com.kdyzm.ssh.doamin.User;
import com.kdyzm.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 2984273932580219638L;
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	public String sshActionTest() throws Exception{
		System.out.println("调用了sshActionTest方法！");
//		userService.saveUser(new User());
		User user=userService.getUserById(1L);
		ServletActionContext.getRequest().setAttribute("user", user);
		return "sshActionMethod";
	}
}
