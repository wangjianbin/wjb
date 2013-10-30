package com.wjb.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AdminUpdateService;

public class UpdateInfo extends ActionSupport {
	private Info info;
	private AdminUpdateService updateService;


	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public AdminUpdateService getUpdateService() {
		return updateService;
	}

	public void setUpdateService(AdminUpdateService updateService) {
		this.updateService = updateService;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/error.jsp");
		String checkId=request.getParameter("checkID");
		Integer intid=new Integer(checkId);
		int id=intid.intValue();
		this.updateService.updateInfo(id);
		addFieldError("AdminReviewSuccess",getText("city.admin.review.success"));
		return SUCCESS;
		
		
		
	}

}
