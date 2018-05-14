package com.sptpc.story.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -7049452577601599004L;
	/* `oid` VARCHAR(32) NOT NULL,
	  `oname` VARCHAR(200) DEFAULT NULL,
	  `oimage` VARCHAR(200) DEFAULT NULL,
	  `oprice` DOUBLE DEFAULT NULL,
	  `ocount` INT(11) DEFAULT NULL,
	  `ordertime` DATETIME DEFAULT NULL,*/ 
	private String oid;
	private String oname;
	private String oimage;
	private Double oprice;
	private int ocount;
	private Date ordertime;
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOimage() {
		return oimage;
	}
	public void setOimage(String oimage) {
		this.oimage = oimage;
	}
	public Double getOprice() {
		return oprice;
	}
	public void setOprice(Double oprice) {
		this.oprice = oprice;
	}
	public int getOcount() {
		return ocount;
	}
	public void setOcount(int ocount) {
		this.ocount = ocount;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	
	
	
}
