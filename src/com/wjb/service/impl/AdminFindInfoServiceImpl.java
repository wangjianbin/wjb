package com.wjb.service.impl;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.PageBean;
import com.wjb.dao.AdminFindInfoDao;
import com.wjb.service.AdminFindInfoService;

public class AdminFindInfoServiceImpl implements AdminFindInfoService {
	private AdminFindInfoDao findinfo;
	

	public AdminFindInfoDao getFindinfo() {
		return findinfo;
	}


	public void setFindinfo(AdminFindInfoDao findinfo) {
		this.findinfo = findinfo;
	}


	@Override
	public PageBean findInfo(String hql, int pagesize,
			int page, String payforType, String stateType, String typeId) {
		PageBean pagebean=new PageBean();
		int allRow = this.findinfo.infoListContent(hql);
		int totalPage = pagebean.countTotalPage(pagesize,allRow);
		int currentPage=page;
		int pageSize=pagesize;
		List<Info> list= this.findinfo.findInfo(hql,pageSize,currentPage);
		pagebean.setAllRow(allRow);
		pagebean.setCurrentPage(currentPage);
		pagebean.setPageSize(pageSize);
		pagebean.setTotalPage(totalPage);
		pagebean.setList(list);
		pagebean.setPayforType(payforType);
		pagebean.setStateType(stateType);
		pagebean.setTypeId(typeId);
		return pagebean;
	}
}
