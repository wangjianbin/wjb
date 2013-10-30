package com.wjb.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AdminSingFindService;

public class SingFind extends ActionSupport {
	private Info info;
	private AdminSingFindService singFind;
	
	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public AdminSingFindService getSingFind() {
		return singFind;
	}

	public void setSingFind(AdminSingFindService singFind) {
		this.singFind = singFind;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","../info/checkshow.jsp");
		String checkId=request.getParameter("checkID");
		Integer intid=new Integer(checkId);
		int id=intid.intValue();
		this.info=this.singFind.singFind(id);
		return SUCCESS;
		
	}

}
