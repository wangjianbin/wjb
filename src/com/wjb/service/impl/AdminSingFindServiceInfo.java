package com.wjb.service.impl;

import com.wjb.bean.Info;
import com.wjb.dao.AdminSingFindDao;
import com.wjb.service.AdminSingFindService;

public class AdminSingFindServiceInfo implements AdminSingFindService {
	private AdminSingFindDao singFind;
	

	public AdminSingFindDao getSingFind() {
		return singFind;
	}


	public void setSingFind(AdminSingFindDao singFind) {
		this.singFind = singFind;
	}


	@Override
	public Info singFind(int id) {
		return this.singFind.findSingInfo(id);
		
	}

}
