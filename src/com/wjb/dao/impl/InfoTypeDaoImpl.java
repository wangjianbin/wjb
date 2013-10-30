package com.wjb.dao.impl;

import java.util.List;
import java.util.TreeMap;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wjb.bean.Info;
import com.wjb.bean.InfoType;
import com.wjb.dao.InfoTypeDao;

public class InfoTypeDaoImpl extends HibernateDaoSupport implements InfoTypeDao {

	@Override
	public List<InfoType> searchInfo() {
		List<InfoType> list=this.getHibernateTemplate().find("from InfoType it order by it.typesign");
		return list;
	}
	@Override
	public List<Info> findPayforInfo() {
		String hql="from Info info where (info.infostate='1') and (info.infopayfor = '1') order by info.infodate desc";
		List<Info> payforList=(List<Info>)this.getHibernateTemplate().find(hql);
		return payforList;
	}
	@Override
	public List findFreeInfo(int typesign) {
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query query=session.createQuery("from Info info where (info.infotype.typesign="+typesign+") and (info.infostate='1') and (info.infopayfor='0') order by info.infodate desc");
		session.beginTransaction();
		query.setFirstResult(0);
		query.setMaxResults(4);
		List freeInfo=query.list();
		session.getTransaction().commit();
		session.flush();
		session.close();
		return freeInfo;
	}
	@Override
	public List<Info> searchInfo(String sql) {
		List<Info> searchInfo=(List<Info>)this.getHibernateTemplate().find(sql);
		return searchInfo;
	}

}
