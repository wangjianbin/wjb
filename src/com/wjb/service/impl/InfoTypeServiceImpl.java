package com.wjb.service.impl;

import java.util.List;

import com.wjb.bean.Info;
import com.wjb.bean.InfoType;
import com.wjb.dao.InfoTypeDao;
import com.wjb.service.InfoTypeService;

public class InfoTypeServiceImpl implements InfoTypeService{
	private InfoTypeDao infoTypeDao;
	public InfoTypeDao getInfoTypeDao() {
		return infoTypeDao;
	}

	public void setInfoTypeDao(InfoTypeDao infoTypeDao) {
		this.infoTypeDao = infoTypeDao;
	}

	@Override
	public List<InfoType> searchInfo() {
		return this.infoTypeDao.searchInfo();

	}
	@Override
	public List<Info> findPayforInfo() {
		return this.infoTypeDao.findPayforInfo();
	}
	@Override
	public List findFreeInfo(int typesign) {
		return this.infoTypeDao.findFreeInfo(typesign);
	}
	@Override
	public List<Info> searchInfo(String sql) {
		return this.infoTypeDao.searchInfo(sql);
	}

}
