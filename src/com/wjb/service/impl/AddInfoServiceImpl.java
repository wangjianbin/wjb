package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.AddInfoDao;
import com.wjb.service.AddInfoService;

public class AddInfoServiceImpl implements AddInfoService {
	private AddInfoDao addInfoDao;
	public AddInfoDao getAddInfoDao() {
		return addInfoDao;
	}
	public void setAddInfoDao(AddInfoDao addInfoDao) {
		this.addInfoDao = addInfoDao;
	}
	@Override
	public void saveInfo(Info info) {
		this.addInfoDao.saveInfo(info);
	}

}
