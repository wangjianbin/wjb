package com.wjb.action.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.User;
import com.wjb.service.LoginService;

public class LoginAction extends ActionSupport {
	private User user;
	private LoginService loginService;
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpSession session=request.getSession();	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String Login() {
			if(this.user.getUsername()==null||this.user.getUsername().equals(""))
			{
				addFieldError("nameError",getText("city.login.no.name"));
			} else if(this.user.getPassword()==null||this.user.getPassword().equals(""))
			{
				addFieldError("passwordError",getText("city.login.no.password"));
			}
			if(this.loginService.login(this.user.getUsername(), this.user.getPassword())==null)
			{
				addFieldError("loginE",getText("city.login.wrong.input"));
				return INPUT;
			}
			session.putValue("user", user);
			return SUCCESS;
		}
	public String isLogin(){
		Object ob=session.getValue("user");
		if(ob==null||!(ob instanceof User))
			return INPUT;
		else
			return SUCCESS;
	}
	public String outLogin() throws Exception
	{
		session.removeAttribute("user");
		return "logout";
	}
	

}
