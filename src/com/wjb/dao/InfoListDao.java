package com.wjb.dao;

import java.util.List;

import com.wjb.bean.Info;

public interface InfoListDao {
	public List<Info> freeInfoList(int typesign , int pagesize, int page);
	public List<Info> payforList(int typesign,int pagesize,int page);
	public int freePageAllRowCount(int typesign);
	public int payforList(int typesign);

}
