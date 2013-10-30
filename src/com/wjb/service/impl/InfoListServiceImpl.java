package com.wjb.service.impl;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.PageBean;
import com.wjb.dao.InfoListDao;
import com.wjb.service.InfoListService;

public class InfoListServiceImpl implements InfoListService {
	
	private InfoListDao infoListDao;
	
	public InfoListDao getInfoListDao() {
		return infoListDao;
	}


	public void setInfoListDao(InfoListDao infoListDao) {
		this.infoListDao = infoListDao;
	}


	@Override
	public PageBean freeInfoList(int typesign,int pagesize,int page) {
		PageBean pagebean=new PageBean();
		int allRow = this.infoListDao.freePageAllRowCount(typesign);
		int totalPage = pagebean.countTotalPage(pagesize,  allRow);
		int currentPage=page;
		int pageSize=pagesize;
		List<Info> list= this.infoListDao.freeInfoList(typesign,pageSize,currentPage);
		pagebean.setAllRow(allRow);
		pagebean.setCurrentPage(currentPage);
		pagebean.setPageSize(pageSize);
		pagebean.setTotalPage(totalPage);
		pagebean.setList(list);
		pagebean.setInfoType(typesign);
		return pagebean;
		
	}
	@Override
	public PageBean payforList(int typesign,int pagesize,int page) {
		PageBean pagebean=new PageBean();
		int allRow = this.infoListDao.payforList(typesign);
		int totalPage = pagebean.countTotalPage(pagesize,  allRow);
		int currentPage=page;
		int pageSize=pagesize;
		List<Info> list= this.infoListDao.payforList(typesign,pageSize,currentPage);
		pagebean.setAllRow(allRow);
		pagebean.setCurrentPage(currentPage);
		pagebean.setPageSize(pageSize);
		pagebean.setTotalPage(totalPage);
		pagebean.setList(list);
		pagebean.setInfoType(typesign);
		return pagebean;
	}

}
