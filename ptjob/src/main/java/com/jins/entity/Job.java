package com.jins.entity;

import java.util.Date;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Job {
	private Integer id;
	private String jobName;
	private Integer jobType;
	@TableField(exist = false)
	private String typeName;

	private String jobRequire;
	private String jobPlace;
	private Double jobSalary;
	private String jobTel;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date jobTime;
	private String jobRemark;
	private Integer userId;

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobName=" + jobName + ", jobType=" + jobType + ", jobRequire=" + jobRequire
				+ ", jobPlace=" + jobPlace + ", jobSalary=" + jobSalary + ", jobTel=" + jobTel + ", jobTime=" + jobTime
				+ ", jobRemark=" + jobRemark + ", userId=" + userId + "]";
	}

	public Job() {

	}

	public Job(String jobName, Integer jobType) {
		super();
		this.jobName = jobName;
		this.jobType = jobType;
	}

	public Job(String jobName, Integer jobType, Integer userId) {
		super();
		this.jobName = jobName;
		this.jobType = jobType;
		this.userId = userId;
	}

	public Job(String jobName, Integer jobType, String jobRequire, String jobPlace, Double jobSalary, String jobTel,
			Date jobTime, String jobRemark, Integer userId) {
		super();
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobRequire = jobRequire;
		this.jobPlace = jobPlace;
		this.jobSalary = jobSalary;
		this.jobTel = jobTel;
		this.jobTime = jobTime;
		this.jobRemark = jobRemark;
		this.userId = userId;
	}

	public Job(Integer id, String jobName, Integer jobType, String jobRequire, String jobPlace, Double jobSalary,
			String jobTel, Date jobTime, String jobRemark, Integer userId) {
		this.id = id;
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobRequire = jobRequire;
		this.jobPlace = jobPlace;
		this.jobSalary = jobSalary;
		this.jobTel = jobTel;
		this.jobTime = jobTime;
		this.jobRemark = jobRemark;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Integer getJobType() {
		return jobType;
	}

	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}

	
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getJobRequire() {
		return jobRequire;
	}

	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire;
	}

	public String getJobPlace() {
		return jobPlace;
	}

	public void setJobPlace(String jobPlace) {
		this.jobPlace = jobPlace;
	}

	public Double getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(Double jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobTel() {
		return jobTel;
	}

	public void setJobTel(String jobTel) {
		this.jobTel = jobTel;
	}

	public Date getJobTime() {
		return jobTime;
	}

	public void setJobTime(Date jobTime) {
		this.jobTime = jobTime;
	}

	public String getJobRemark() {
		return jobRemark;
	}

	public void setJobRemark(String jobRemark) {
		this.jobRemark = jobRemark;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
