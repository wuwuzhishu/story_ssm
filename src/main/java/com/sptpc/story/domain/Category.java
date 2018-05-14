package com.sptpc.story.domain;

import java.io.Serializable;

public class Category implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -5342492517183616867L;
	/*`cid` VARCHAR(32) NOT NULL,
	  `cname` VARCHAR(20) DEFAULT NULL,*/
	private String cid;
	private String cname;
	
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
