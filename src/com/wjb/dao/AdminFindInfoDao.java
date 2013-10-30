package com.wjb.dao;

import java.util.List;

import com.wjb.bean.Info;

public interface AdminFindInfoDao {
	public List<Info> findInfo(String hql,int pageSize,int currentPage);
	public int infoListContent(String hql);

}
