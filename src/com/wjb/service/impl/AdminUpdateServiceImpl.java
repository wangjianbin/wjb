package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.AdminUpdateDao;
import com.wjb.service.AdminUpdateService;

public class AdminUpdateServiceImpl implements AdminUpdateService {
	private AdminUpdateDao updatedao;
	

	public AdminUpdateDao getUpdatedao() {
		return updatedao;
	}


	public void setUpdatedao(AdminUpdateDao updatedao) {
		this.updatedao = updatedao;
	}


	@Override
	public void updateInfo(int id) {
		this.updatedao.updateInfo(id);
		
	}

}
