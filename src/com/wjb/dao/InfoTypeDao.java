package com.wjb.dao;


import java.util.List;
import java.util.TreeMap;

import com.wjb.bean.Info;
import com.wjb.bean.InfoType;

public interface InfoTypeDao {
	public List<InfoType> searchInfo();
	public List<Info> findPayforInfo();
	public List findFreeInfo(int typesign);
	public List<Info> searchInfo(String sql);

}
