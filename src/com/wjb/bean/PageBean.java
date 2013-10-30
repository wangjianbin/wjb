package com.wjb.bean;

import java.util.List;

public class PageBean {
	private int allRow;     //总记录数
	private int totalPage;   //总页数
	private int currentPage;   //当前页
	private int pageSize;      //每页显示数
	private int infoType;
	private String payforType;
	private String stateType;
	private String typeId;
	private List<Info> list;
	
	public String getPayforType() {
		return payforType;
	}
	public void setPayforType(String payforType) {
		this.payforType = payforType;
	}
	public String getStateType() {
		return stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public List<Info> getList() {
		return list;
	}
	public void setList(List<Info> list) {
		this.list = list;
	}
	public int getInfoType() {
		return infoType;
	}
	public void setInfoType(int infoType) {
		this.infoType = infoType;
	}
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int countTotalPage(int pageSize,int allRow)
	{
		return  (allRow+pageSize-1)/pageSize;
	}
	

}
