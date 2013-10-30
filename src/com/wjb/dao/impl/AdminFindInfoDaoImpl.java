package com.wjb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.AdminFindInfoDao;

public class AdminFindInfoDaoImpl extends HibernateDaoSupport implements AdminFindInfoDao{
	@Override
	public List<Info> findInfo(String hql,int pageSize,int currentPage) {
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query query=session.createQuery(hql);
		session.beginTransaction();
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Info> list=(List<Info>)query.list();
		session.getTransaction().commit();
		session.flush();
		session.close();		
		return list;
	}
	@Override
	public int infoListContent(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

}
