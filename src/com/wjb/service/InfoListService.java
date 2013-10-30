package com.wjb.service;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.PageBean;

public interface InfoListService {
	public PageBean freeInfoList(int typesign,int pagesize,int page);
	public PageBean payforList(int typesign,int pagesize,int page);

}
