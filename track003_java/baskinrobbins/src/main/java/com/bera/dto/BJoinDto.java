package com.bera.dto;

import java.time.LocalDateTime;

public class BJoinDto {
	private int idNum;
	private String userId;
	private String userName;
	private String email;
	private String passw;
	private LocalDateTime birth;
	private String gender;
	private LocalDateTime joindate;
	private String chk;
	public BJoinDto() { super(); }
	public BJoinDto(int idNum, String userId, String userName, String email, String passw, LocalDateTime birth,
			String gender, LocalDateTime joindate, String chk) {
		super();
		this.idNum = idNum;
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.passw = passw;
		this.birth = birth;
		this.gender = gender;
		this.joindate = joindate;
		this.chk = chk;
	}
	public int getIdNum() { return idNum; } 
	public void setIdNum(int idNum) { this.idNum = idNum; }
	
	public String getUserId() { return userId; } 
	public void setUserId(String userId) { this.userId = userId; }
	
	public String getUserName() { return userName; } 
	public void setUserName(String userName) { this.userName = userName; }
	
	public String getEmail() { return email; } 
	public void setEmail(String email) { this.email = email; }
	
	public String getPassw() { return passw; } 
	public void setPassw(String passw) { this.passw = passw; } 
	
	public LocalDateTime getBirth() { return birth; }
	public void setBirth(LocalDateTime birth) { this.birth = birth; }
	
	public String getGender() { return gender; } 
	public void setGender(String gender) { this.gender = gender; }
	
	public LocalDateTime getJoindate() { return joindate; } 
	public void setJoindate(LocalDateTime joindate) { this.joindate = joindate; } 
	
	public String getChk() { return chk; } 
	public void setChk(String chk) { this.chk = chk; }
	
	@Override
	public String toString() {
		return "BJoinDto [idNum=" + idNum + ", userId=" + userId + ", userName=" + userName + ", email=" + email
				+ ", passw=" + passw + ", birth=" + birth + ", gender=" + gender + ", joindate=" + joindate + ", chk="
				+ chk + "]";
	}
}
/*	 
idNum       int not null primary key, 
userId      VARCHAR2(100) NOT NULL,
userName    VARCHAR2(150) NOT NULL,
email       VARCHAR2(100) NOT NULL,
passw       VARCHAR2(100) NOT NULL,
birth       DATE default sysdate  NOT NULL,
gender      VARCHAR2(20) NOT NULL,
joindate    DATE default sysdate  NOT NULL,
chk      VARCHAR2(20) NOT NULL
*/