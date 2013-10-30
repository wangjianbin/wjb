package com.wjb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.AdminSingFindDao;

public class AdminSingFindDaoImpl extends HibernateDaoSupport implements AdminSingFindDao {

	@Override
	public Info findSingInfo(int id) {
		Object[] object=new Object[1];
		object[0]=id;
		List<Info> list=(List<Info>)this.getHibernateTemplate().find("from Info info where info.id=?",object);
		if(list!=null&&list.size()>0)
		{
			return list.get(0);
		}
		return null;
		
	}

}
