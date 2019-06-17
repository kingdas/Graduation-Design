package com.jins.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Deliver {
	private Integer id;
	private Integer userId;
	private Integer jobId;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date deliverTime;

	@Override
	public String toString() {
		return "Deliver [id=" + id + ", userId=" + userId + ", jobId=" + jobId + ", deliverTime=" + deliverTime + "]";
	}

	public Deliver() {
	}

	public Deliver(Integer userId, Integer jobId, Date deliverTime) {
		super();
		this.userId = userId;
		this.jobId = jobId;
		this.deliverTime = deliverTime;
	}

	public Deliver(Integer id, Integer userId, Integer jobId, Date deliverTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.jobId = jobId;
		this.deliverTime = deliverTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Date getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}

}
