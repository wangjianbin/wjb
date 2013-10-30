package com.wjb.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AdminSetMoneyService;

public class SetMoney extends ActionSupport {
	private AdminSetMoneyService setMoneyService;
	private Info info;
	public AdminSetMoneyService getSetMoneyService() {
		return setMoneyService;
	}
	public void setSetMoneyService(AdminSetMoneyService setMoneyService) {
		this.setMoneyService = setMoneyService;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/error.jsp");
		String checkId=request.getParameter("moneyID");
		Integer intid=new Integer(checkId);
		int id=intid.intValue();
		this.setMoneyService.setMoney(id);
		addFieldError("AdminsetMoneySuccess",getText("city.admin.setMoneys.success"));
		return SUCCESS;
	}
	

}
