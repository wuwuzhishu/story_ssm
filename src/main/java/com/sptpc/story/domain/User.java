package com.sptpc.story.domain;

import java.io.Serializable;

//实体类
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4218054490098400863L;
	/*`uid` VARCHAR(32) NOT NULL,
	  `username` VARCHAR(20) DEFAULT NULL,
	  `password` VARCHAR(20) DEFAULT NULL,*/
	private String uid;
	private String username;
	private String password;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
