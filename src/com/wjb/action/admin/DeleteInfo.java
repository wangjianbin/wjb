package com.wjb.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AdminDeleteService;

public class DeleteInfo extends ActionSupport {
	private Info info;
	private AdminDeleteService deleteService;
	
	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public AdminDeleteService getDeleteService() {
		return deleteService;
	}

	public void setDeleteService(AdminDeleteService deleteService) {
		this.deleteService = deleteService;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/error.jsp");
		String checkId=request.getParameter("deleteID");
		Integer intid=new Integer(checkId);
		int id=intid.intValue();
		this.deleteService.deleteInfo(id);
		addFieldError("AdmindeleteSuccess",getText("city.admin.delete.success"));
		return SUCCESS;
	}

}
