package com.wjb.action.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wjb.bean.Info;
import com.wjb.bean.InfoType;
import com.wjb.service.InfoTypeService;

public class FindTypeInfoAction extends ActionSupport {
	private InfoType infoType;
	private Info info;
	public List<InfoType> list=null;
	public List<Info> payforList=null;
	public List freeInfoList=new ArrayList();
	public Map map=new HashMap();
	private InfoTypeService infoTypeService;
	public TreeMap treeMap=new TreeMap();
	
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public InfoType getInfoType() {
		return infoType;
	}
	public void setInfoType(InfoType infoType) {
		this.infoType = infoType;
	}
	public InfoTypeService getInfoTypeService() {
		return infoTypeService;
	}
	public void setInfoTypeService(InfoTypeService infoTypeService) {
		this.infoTypeService = infoTypeService;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		list=this.infoTypeService.searchInfo();	
		Iterator<InfoType> itor=list.iterator();
		while(itor.hasNext())
		{
			this.infoType=itor.next();
			int typesign=infoType.getTypesign();
			String typename=infoType.getTypename();
			treeMap.put(typesign,typename);
		}
		payforList=this.infoTypeService.findPayforInfo();
		if(treeMap!=null&&treeMap.size()!=0){
			Iterator itype=treeMap.keySet().iterator();	
			while(itype.hasNext()){
				int sign=((Integer)itype.next()).intValue();
				List onesublist=this.infoTypeService.findFreeInfo(sign);
				freeInfoList.add(onesublist);
			}
		}
		request.setAttribute("allsublist",freeInfoList);
		request.setAttribute("payforlist",payforList);
		session.putValue("treeMap", treeMap);
		map.put("ID值","id");
		map.put("信息标题","infotitle");
		map.put("信息内容","infocount");
		map.put("联系人","infolinkman");
		map.put("联系电话","infophone");
		map.put("E-mail地址","infoemail");
		session.putValue("map", map);
		return SUCCESS;
	}
}
