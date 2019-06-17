package com.jins.entity;

import org.springframework.stereotype.Component;

@Component
public class JobType {
	private Integer id;
	private String typeName;

	@Override
	public String toString() {
		return "JobType [id=" + id + ", typeName=" + typeName + "]";
	}

	public JobType() {

	}

	public JobType(Integer id, String typeName) {
		this.id = id;
		this.typeName = typeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	

}
