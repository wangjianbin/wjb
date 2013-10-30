package com.wjb.action.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AdminMoneyInfoService;

public class SetMoneyInfo extends ActionSupport {
	private AdminMoneyInfoService moneyInfoService;
	private Info info;
	public AdminMoneyInfoService getMoneyInfoService() {
		return moneyInfoService;
	}
	public void setMoneyInfoService(AdminMoneyInfoService moneyInfoService) {
		this.moneyInfoService = moneyInfoService;
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
		request.setAttribute("mainPage","../info/moneyshow.jsp");
		String moneyId=request.getParameter("MoneyId");
		int id=0;
		if(moneyId==null||moneyId.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("moneyIDError",getText("city.admin.setMoney.no.moneyID"));

		}	
		else 
		{
			try{
				id=Integer.parseInt(moneyId);
				if(id<0){
					request.setAttribute("mainPage","/pages/error.jsp");
					addFieldError("moneyIDError",getText("city.admin.setMoney.moneyID.0"));
					
				}
					
			}catch(NumberFormatException e)
			{
				request.setAttribute("mainPage","/pages/error.jsp");
				addFieldError("moneyIDError",getText("city.admin.setMoney.format.moneyID"));
				e.printStackTrace();
			}
		}
		this.info=this.moneyInfoService.setmoneyInfo(id);
		if(this.info==null)
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("setMoneyIDError",getText("city.admin.setMoney.nomoneyID"));
			
		}
		return SUCCESS;
	}

}
