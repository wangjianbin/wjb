package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.AdminMoneyInfoDao;
import com.wjb.service.AdminMoneyInfoService;

public class AdminMoneyInfoServiceImpl implements AdminMoneyInfoService {
	private AdminMoneyInfoDao moneyInfoDao;
	

	public AdminMoneyInfoDao getMoneyInfoDao() {
		return moneyInfoDao;
	}


	public void setMoneyInfoDao(AdminMoneyInfoDao moneyInfoDao) {
		this.moneyInfoDao = moneyInfoDao;
	}


	@Override
	public Info setmoneyInfo(int id) {
		return this.moneyInfoDao.setmoneyInfo(id);
	}

}
