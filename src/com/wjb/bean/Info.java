package com.wjb.bean;

import java.util.Date;

public class Info {
	private int id;
	private String infotitle;
	private String infocount;
	private String infolinkman;
	private String infophone;
	private String infoemail;
	private String infostate;
	private String infopayfor;
	private Date infodate;
	private InfoType infotype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfotitle() {
		return infotitle;
	}
	public void setInfotitle(String infotitle) {
		this.infotitle = infotitle;
	}
	public String getInfocount() {
		return infocount;
	}
	public void setInfocount(String infocount) {
		this.infocount = infocount;
	}
	public String getInfolinkman() {
		return infolinkman;
	}
	public void setInfolinkman(String infolinkman) {
		this.infolinkman = infolinkman;
	}
	public String getInfophone() {
		return infophone;
	}
	public void setInfophone(String infophone) {
		this.infophone = infophone;
	}
	public String getInfoemail() {
		return infoemail;
	}
	public void setInfoemail(String infoemail) {
		this.infoemail = infoemail;
	}
	public String getInfostate() {
		return infostate;
	}
	public void setInfostate(String infostate) {
		this.infostate = infostate;
	}
	public String getInfopayfor() {
		return infopayfor;
	}
	public void setInfopayfor(String infopayfor) {
		this.infopayfor = infopayfor;
	}
	public Date getInfodate() {
		return infodate;
	}
	public void setInfodate(Date infodate) {
		this.infodate = infodate;
	}
	public InfoType getInfotype() {
		return infotype;
	}
	public void setInfotype(InfoType infotype) {
		this.infotype = infotype;
	}

}
