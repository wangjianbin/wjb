package com.wjb.action.info;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.bean.InfoType;
import com.wjb.bean.PageBean;
import com.wjb.service.InfoListService;

public class InfoList extends ActionSupport {
	private PageBean pageBean1;
	private PageBean pageBean2;
	private int page1;
	private int page2;
	public List<Info> freeInfoList;
	public List<Info> payforInfoList;
	private Info info;
	private InfoListService infoListService;
	
	
	public int getPage1() {
		return page1;
	}



	public void setPage1(int page1) {
		this.page1 = page1;
	}



	public int getPage2() {
		return page2;
	}



	public void setPage2(int page2) {
		this.page2 = page2;
	}



	public PageBean getPageBean2() {
		return pageBean2;
	}



	public void setPageBean2(PageBean pageBean2) {
		this.pageBean2 = pageBean2;
	}
	public PageBean getPageBean1() {
		return pageBean1;
	}



	public void setPageBean1(PageBean pageBean1) {
		this.pageBean1 = pageBean1;
	}

	public Info getInfo() {
		return info;
	}



	public void setInfo(Info info) {
		this.info = info;
	}



	public InfoListService getInfoListService() {
		return infoListService;
	}



	public void setInfoListService(InfoListService infoListService) {
		this.infoListService = infoListService;
	}



	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","/pages/show/listshow.jsp");
		String infoType=request.getParameter("infoType");
		int typesign=Integer.parseInt(infoType);
		String pagenum1 =request.getParameter("page1");
		if(pagenum1==null||pagenum1.equals(""))
		{
			this.page1=1;
		}else{
			this.page1=Integer.parseInt(pagenum1);
		}
		
		this.pageBean1=this.infoListService.freeInfoList(typesign,1,page1);
		freeInfoList=this.pageBean1.getList();
		String pagenum2 =request.getParameter("page2");
		if(pagenum2==null||pagenum2.equals(""))
		{
			this.page2=1;
		}else{
			this.page2=Integer.parseInt(pagenum2);
		}
		
		String infoType2=request.getParameter("infoType");
		this.pageBean2=this.infoListService.payforList(typesign,1,page2);
		payforInfoList=this.pageBean2.getList();
		request.setAttribute("onepayforlist", payforInfoList);
		request.setAttribute("onefreelist",freeInfoList);
		return SUCCESS;
		
	}

}
