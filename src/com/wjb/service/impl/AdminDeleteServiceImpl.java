package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.AdminDeleteDao;
import com.wjb.service.AdminDeleteService;

public class AdminDeleteServiceImpl implements AdminDeleteService {
	private AdminDeleteDao deleteDao;
	

	public AdminDeleteDao getDeleteDao() {
		return deleteDao;
	}


	public void setDeleteDao(AdminDeleteDao deleteDao) {
		this.deleteDao = deleteDao;
	}


	@Override
	public void deleteInfo(int id) {
		this.deleteDao.deleteInfo(id);

	}

}
