package com.wjb.action.info;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.SingleInfoService;

public class SingleInfo extends ActionSupport {
	private Info info;
	private SingleInfoService singleInfoService;
	
	
	
	public Info getInfo() {
		return info;
	}



	public void setInfo(Info info) {
		this.info = info;
	}



	public SingleInfoService getSingleInfoService() {
		return singleInfoService;
	}



	public void setSingleInfoService(SingleInfoService singleInfoService) {
		this.singleInfoService = singleInfoService;
	}



	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/show/singleshow.jsp");
		String id=request.getParameter("id");
		int infoId=Integer.parseInt(id);
		this.info=this.singleInfoService.singleInfo(infoId);
		if(this.info==null)
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("SingleShowNoExist",getText("city.singleshow.no.exist"));
		}
		return SUCCESS;
		
	}

}
