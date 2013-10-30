package com.wjb.service.impl;

import com.wjb.dao.AdminSetMoneyDao;
import com.wjb.service.AdminSetMoneyService;

public class AdminSetMoneyServiceImpl implements AdminSetMoneyService {
	private AdminSetMoneyDao setMoneyDao;
	

	public AdminSetMoneyDao getSetMoneyDao() {
		return setMoneyDao;
	}


	public void setSetMoneyDao(AdminSetMoneyDao setMoneyDao) {
		this.setMoneyDao = setMoneyDao;
	}


	@Override
	public void setMoney(int id) {
		this.setMoneyDao.setMoney(id);

	}

}
