package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.SingleInfoDao;
import com.wjb.service.SingleInfoService;

public class SingleInfoServiceImpl implements SingleInfoService {
	private SingleInfoDao singleInfoDao;
	

	public SingleInfoDao getSingleInfoDao() {
		return singleInfoDao;
	}


	public void setSingleInfoDao(SingleInfoDao singleInfoDao) {
		this.singleInfoDao = singleInfoDao;
	}


	@Override
	public Info singleInfo(int id) {
		return this.singleInfoDao.singleInfo(id);
	}

}
