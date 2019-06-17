package com.jins.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Integer id;
	private String userName;
	private String userSex;
	private String userAge;
	private String userDegree;
	private String userHobby;
	private String userSpec;
	private String userExp;
	private String userTel;
	private String userWeChat;
	private String userQQ;
	private String userLoginName;
	private String userPassword;
	private String remark;

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userSex=" + userSex + ", userAge=" + userAge
				+ ", userDegree=" + userDegree + ", userExp=" + userExp + ", userHobby=" + userHobby + ", userSpec="
				+ userSpec + ", userTel=" + userTel + ", userWeChat=" + userWeChat + ", userQQ=" + userQQ
				+ ", userLoginName=" + userLoginName + ", userPassword=" + userPassword + ", remark=" + remark + "]";
	}

	public User() {

	}

	public User(String userLoginName, String userPassword) {
		super();
		this.userLoginName = userLoginName;
		this.userPassword = userPassword;
	}

	public User(String userName, String userSex, String userTel, String userLoginName, String userPassword) {
		super();
		this.userName = userName;
		this.userSex = userSex;
		this.userTel = userTel;
		this.userLoginName = userLoginName;
		this.userPassword = userPassword;
	}

	public User(String userName, String userSex, String userAge, String userDegree, String userExp, String userHobby,
			String userSpec, String userTel, String userWeChat, String userQQ, String userLoginName,
			String userPassword, String remark) {
		super();
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userDegree = userDegree;
		this.userExp = userExp;
		this.userHobby = userHobby;
		this.userSpec = userSpec;
		this.userTel = userTel;
		this.userWeChat = userWeChat;
		this.userQQ = userQQ;
		this.userLoginName = userLoginName;
		this.userPassword = userPassword;
		this.remark = remark;
	}

	public User(Integer id, String userName, String userSex, String userAge, String userDegree, String userExp,
			String userHobby, String userSpec, String userTel, String userWeChat, String userQQ, String userLoginName,
			String userPassword, String remark) {
		super();
		this.id = id;
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userDegree = userDegree;
		this.userExp = userExp;
		this.userHobby = userHobby;
		this.userSpec = userSpec;
		this.userTel = userTel;
		this.userWeChat = userWeChat;
		this.userQQ = userQQ;
		this.userLoginName = userLoginName;
		this.userPassword = userPassword;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserDegree() {
		return userDegree;
	}

	public void setUserDegree(String userDegree) {
		this.userDegree = userDegree;
	}

	public String getUserExp() {
		return userExp;
	}

	public void setUserExp(String userExp) {
		this.userExp = userExp;
	}

	public String getUserHobby() {
		return userHobby;
	}

	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}

	public String getUserSpec() {
		return userSpec;
	}

	public void setUserSpec(String userSpec) {
		this.userSpec = userSpec;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserWeChat() {
		return userWeChat;
	}

	public void setUserWeChat(String userWeChat) {
		this.userWeChat = userWeChat;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
