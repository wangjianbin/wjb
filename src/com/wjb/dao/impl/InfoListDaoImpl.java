package com.wjb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.dao.InfoListDao;

public class InfoListDaoImpl extends HibernateDaoSupport implements InfoListDao {

	@Override
	public List<Info> freeInfoList(int typesign,int pagesize,int page) {
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query query=session.createQuery("from Info info where (info.infotype.typesign="+typesign+") and (info.infostate='1') and (info.infopayfor='0') order by info.infodate desc");
		session.beginTransaction();
		query.setFirstResult((page-1)*pagesize);
		query.setMaxResults(pagesize);
		List<Info> freeInfoList=(List<Info>)query.list();
		session.getTransaction().commit();
		session.flush();
		session.close();	
		return freeInfoList;
	}
	@Override
	public List<Info> payforList(int typesign,int pagesize,int page) {
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query query=session.createQuery("from Info info where (info.infotype.typesign="+typesign+") and (info.infostate='1') and (info.infopayfor='1') order by info.infodate desc");
		session.beginTransaction();
		query.setFirstResult((page-1)*pagesize);
		query.setMaxResults(pagesize);
		List<Info> payforInfoList=(List<Info>)query.list();
		session.getTransaction().commit();
		session.flush();
		session.close();	
		return payforInfoList;
		
	}
	@Override
	public int freePageAllRowCount(int typesign) {
		return getHibernateTemplate().find("from Info info where (info.infotype.typesign="+typesign+") and (info.infostate='1') and (info.infopayfor='0') order by info.infodate desc").size();
	}
	@Override
	public int payforList(int typesign) {
		return getHibernateTemplate().find("from Info info where (info.infotype.typesign="+typesign+") and (info.infostate='1') and (info.infopayfor='1') order by info.infodate desc").size();
	}

}
