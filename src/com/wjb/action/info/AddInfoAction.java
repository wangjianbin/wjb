package com.wjb.action.info;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.AddInfoService;

public class AddInfoAction extends ActionSupport {
	private Info info;
	private AddInfoService addInfoService;
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public AddInfoService getAddInfoService() {
		return addInfoService;
	}
	public void setAddInfoService(AddInfoService addInfoService) {
		this.addInfoService = addInfoService;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String changeTime=format.format(new java.util.Date());
		Date date=null;
		try{
			date=format.parse(changeTime);
		}catch(Exception se)
		{
			se.printStackTrace();
		}
		info.setInfostate("0");
		info.setInfopayfor("0");
		info.setInfodate(date);
		String emailRegex="\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		if(this.info.getInfotype().getTypesign()==null)
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("typeError",getText("city.info.no.infoType"));	
		} else if(this.info.getInfotitle()==null||this.info.getInfotitle().equals(""))
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("titleError",getText("city.info.no.infoTitle"));
		} else if(this.info.getInfocount()==null||this.info.getInfocount().equals(""))
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("contentError",getText("city.info.no.infoContent"));
		} else if(this.info.getInfophone()==null||this.info.getInfophone().equals(""))
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("phoneError",getText("city.info.no.infoPhone"));
		} else if(this.info.getInfolinkman()==null||this.info.getInfolinkman().equals(""))
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("linkmanError",getText("city.info.no.infoLinkman"));
		} else if(this.info.getInfoemail()==null||this.info.getInfoemail().equals(""))
		{
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("emailError",getText("city.info.no.infoEmail"));
		}
		if(!info.getInfoemail().matches(emailRegex)){
			request.setAttribute("mainPage","/pages/add/addInfo.jsp");
			addFieldError("emailError",getText("city.info.format.infoEmail"));
		}
		else{
			this.addInfoService.saveInfo(this.info);
			return SUCCESS;
		}
		return ERROR;
		
	}

}
