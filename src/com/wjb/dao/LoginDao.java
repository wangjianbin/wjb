package com.wjb.dao;

import com.wjb.bean.User;

public interface LoginDao {
	public User login(String username,String password);

}
