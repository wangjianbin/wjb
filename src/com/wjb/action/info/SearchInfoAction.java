package com.wjb.action.info;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.service.InfoTypeService;
import com.wjb.util.SearchInfo;

public class SearchInfoAction extends ActionSupport {
	private Info info;
	private SearchInfo searchInfo;
	private InfoTypeService searchService;
	
	
	
	public Info getInfo() {
		return info;
	}



	public void setInfo(Info info) {
		this.info = info;
	}



	public SearchInfo getSearchInfo() {
		return searchInfo;
	}



	public void setSearchInfo(SearchInfo searchInfo) {
		this.searchInfo = searchInfo;
	}



	public InfoTypeService getSearchService() {
		return searchService;
	}



	public void setSearchService(InfoTypeService searchService) {
		this.searchService = searchService;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String gjz=this.searchInfo.getGjz();
		String tj=this.searchInfo.getTj();
		String lx=this.searchInfo.getLx();
		String sql="";
		if(gjz==null||gjz.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("SearchNoV",getText("city.info.search.no.value"));
			
		} else if(tj==null||tj.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("SearchNoC",getText("city.info.search.no.condition"));
		} else if(lx==null||lx.equals(""))
		{
			request.setAttribute("mainPage","/pages/error.jsp");
			addFieldError("SearchNoT",getText("city.info.search.no.type"));
		}else{
			request.setAttribute("mainPage","/pages/show/searchshow.jsp");
			if(lx.equals("like")){
				
				sql="from Info info where (info."+tj+" like '%"+gjz+"%' ) order by info.infodate ";	
			}
			else{		
				sql="from Info info where (info."+tj+" = "+gjz+") order by info.infodate ";
			}
			
			List<Info> searchlist=this.searchService.searchInfo(sql);
			request.setAttribute("searchlist",searchlist);
			
		}
		
		return SUCCESS;
		
	}

}
