package com.wjb.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.AddInfoDao;

public class AddInfoDaoImpl extends HibernateDaoSupport implements AddInfoDao{
	@Override
	public void saveInfo(Info info) {
		this.getHibernateTemplate().save(info);
	}
}
