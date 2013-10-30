package com.wjb.service.impl;

import com.wjb.bean.User;
import com.wjb.dao.LoginDao;
import com.wjb.service.LoginService;

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	@Override
	public User login(String username, String password) {
		return loginDao.login(username, password);	
	}

}
