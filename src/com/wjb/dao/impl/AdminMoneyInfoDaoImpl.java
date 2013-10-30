package com.wjb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.AdminMoneyInfoDao;

public class AdminMoneyInfoDaoImpl extends HibernateDaoSupport implements
		AdminMoneyInfoDao {

	@Override
	public Info setmoneyInfo(int id) {
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
