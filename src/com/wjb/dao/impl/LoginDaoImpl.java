package com.wjb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.User;
import com.wjb.dao.LoginDao;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	@Override
	public User login(String username, String password) {
		String hql="from User u where u.username=? and u.password=?";
		List<User> list=(List<User>)this.getHibernateTemplate().find(hql,new String[]{username,password});
		if(list!=null&&list.size()>0)
		{
			return list.get(0);
		}
		return null;
		
	}

}
