package com.wjb.service;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.PageBean;

public interface AdminFindInfoService {
	public PageBean findInfo(String hql,int pagesize,int page,String payforType,String stateType,String typeId);

}
