package com.wjb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.AdminDeleteDao;

public class AdminDeleteDaoImpl extends HibernateDaoSupport implements
		AdminDeleteDao {

	@Override
	public void deleteInfo(int id) {
		List<Info> list=(List<Info>)this.getHibernateTemplate().find("from Info info where info.id="+id+"");
		if(list!=null&&list.size()>0)
		{
			this.getHibernateTemplate().delete(list.get(0));
		}
		
	}
}
