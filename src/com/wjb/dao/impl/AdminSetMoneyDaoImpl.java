package com.wjb.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.dao.AdminSetMoneyDao;

public class AdminSetMoneyDaoImpl extends HibernateDaoSupport implements AdminSetMoneyDao {

	@Override
	public void setMoney(int id) {
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query query=session.createQuery("update Info info set info.infopayfor='1' where info.id="+id+"");
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		session.flush();
		session.close();

	}

}
