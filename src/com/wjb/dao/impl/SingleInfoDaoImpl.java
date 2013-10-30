package com.wjb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.SingleInfoDao;

public class SingleInfoDaoImpl extends HibernateDaoSupport implements SingleInfoDao {

	@Override
	public Info singleInfo(int id) {
		String hql="from Info info where info.id="+id+"";
		List<Info> list=(List<Info>)this.getHibernateTemplate().find(hql);
		if(list!=null&&list.size()>0)
		{
			return list.get(0);
		}
		return null;
	}

}
