package com.wjb.service;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.InfoType;

public interface InfoTypeService {
	public List<InfoType> searchInfo();
	public List<Info> findPayforInfo();
	public List findFreeInfo(int typesign);
	public List<Info> searchInfo(String sql);

}
