package com.wjb.action.info;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class InfoAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/add/addInfo.jsp");
		return SUCCESS;
	}

}
