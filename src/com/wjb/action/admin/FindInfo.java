package com.wjb.action.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.bean.InfoType;
import com.wjb.bean.PageBean;
import com.wjb.service.AdminFindInfoService;

public class FindInfo extends ActionSupport {
	private int page;
	private PageBean pageBean;
	private Info info;
	private AdminFindInfoService findInfoService;
	public Object[] object=null;
	public List<Info> list=null;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}

	public AdminFindInfoService getFindInfoService() {
		return findInfoService;
	}


	public void setFindInfoService(AdminFindInfoService findInfoService) {
		this.findInfoService = findInfoService;
	}


	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("mainPage","../info/listshow.jsp");
		String payforType=request.getParameter("infopayfor");
		String stateType=request.getParameter("infostate");
		String typeId=request.getParameter("typeId");
		String pagenum=request.getParameter("page");
		if(pagenum==null||pagenum.equals(""))
		{
			this.page=1;
		}else{
			this.page=Integer.parseInt(pagenum);
		}
		String hql="";
		if(typeId==null||typeId.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("AdminListNoType",getText("city.admin.list.no.infoType"));
			
		}else if(payforType==null||payforType.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("AdminListNoPayForType",getText("city.admin.list.no.payforType"));
		}else if(stateType==null||stateType.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("AdminListNoStateType",getText("city.admin.list.no.stateType"));
		}else
			{
			
			int infoType=Integer.parseInt(typeId);
			if(!payforType.equals("all")&&!stateType.equals("all"))
				{
					
					hql="from Info info where info.infopayfor="+payforType+" and info.infostate="+stateType+" and info.infotype.typesign="+infoType+" order by info.infodate";
				}else if(payforType.equals("all")&&stateType.equals("all"))
				{
					hql="from Info info where info.infotype.typesign="+infoType+" order by info.infodate";
					
				}else if(payforType.equals("all"))
				{
					hql="from Info info where info.infostate="+stateType+" and info.infotype.typesign="+infoType+" order by info.infodate";
				}else if(stateType.equals("all"))
				{
					hql="from Info info where info.infopayfor="+payforType+" and info.infotype.typesign="+infoType+" order by info.infodate";
				}
				this.pageBean=this.findInfoService.findInfo(hql,10,page,payforType,stateType,typeId);
				list=this.pageBean.getList();
			}
		request.setAttribute("adminlist", list);
		
		return SUCCESS;
	}

}
