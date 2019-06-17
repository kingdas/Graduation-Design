package com.jins.entity;

import java.util.Date;

public class Admin {
	private int id;
	private String adminName;
	private String adminPassword;
	private String name;
	private Date lastTime;

	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminName=" + adminName + ", adminPassword=" + adminPassword + ", name=" + name
				+ ", lastTime=" + lastTime + "]";
	}

	public Admin() {

	}

	public Admin(int id, String adminName, String adminPassword, String name, Date lastTime) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.name = name;
		this.lastTime = lastTime;
	}

	public Admin(String adminName, String adminPassword, String name, Date lastTime) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.name = name;
		this.lastTime = lastTime;
	}

	public Admin(String adminName, String adminPassword) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

}
