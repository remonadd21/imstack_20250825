package com.bera.dto;

import java.time.LocalDateTime;

public class BeraDto {

	private int idNum;      
	private String userId;
	private String userName;
	private String userPass;
	private String title;
	private String content;
	private String userIcename;
    private LocalDateTime writeDate;
    private int hit;
	public BeraDto() { super(); }

	public BeraDto(int idNum, String userId, String userName, String userPass, String title, String content,
			String userIcename, LocalDateTime writeDate, int hit) {
		super();
		this.idNum = idNum;
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.title = title;
		this.content = content;
		this.userIcename = userIcename;
		this.writeDate = writeDate;
		this.hit = hit;
	}

	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserIcename() {
		return userIcename;
	}
	public void setUserIcename(String userIcename) {
		this.userIcename = userIcename;
	}
	public LocalDateTime getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BeraDto [idNum=" + idNum + ", userId=" + userId + ", userName=" + userName + ", userPass=" + userPass
				+ ", title=" + title + ", content=" + content + ", userIcename=" + userIcename + ", writeDate="
				+ writeDate + ", hit=" + hit + "]";
	}

}
