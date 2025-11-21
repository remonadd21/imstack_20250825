package com.bera.dto;

import java.sql.Date;

public class BeraUserDto {
    private int userid;           // NUMBER
    private String email;         // VARCHAR2(100)
    private String pass;          // VARCHAR2(100)
    private String birth;         // VARCHAR(100)
    private String gender;        // VARCHAR(50)
    private Date joindate;        // DATE
    private String agree;         // VARCHAR(50)

    public BeraUserDto() {}

    public BeraUserDto(int userid, String email, String pass, String birth,
                       String gender, Date joindate, String agree) {
        this.userid = userid;
        this.email = email;
        this.pass = pass;
        this.birth = birth;
        this.gender = gender;
        this.joindate = joindate;
        this.agree = agree;
    }

    public int getUserid() { return userid; }
    public void setUserid(int userid) { this.userid = userid; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }

    public String getBirth() { return birth; }
    public void setBirth(String birth) { this.birth = birth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Date getJoindate() { return joindate; }
    public void setJoindate(Date joindate) { this.joindate = joindate; }

    public String getAgree() { return agree; }
    public void setAgree(String agree) { this.agree = agree; }

    @Override
    public String toString() {
        return "BeraUserDto{" +
                "userid=" + userid +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", joindate=" + joindate +
                ", agree='" + agree + '\'' +
                '}';
    }
}

/*
CREATE TABLE bruser(
    userid  NUMBER   PRIMARY KEY,         -- 사용자 고유 ID
    email  VARCHAR2(100),                      -- 이메일
    pass   VARCHAR2(100),
    birth   VARCHAR(100),                               -- 생년월일
    gender          VARCHAR(50)    default   'F'    ,                            -- 성별 (M/F)
    joindate       Date  default sysdate ,               -- 가입일
    agree           VARCHAR(50)     default   'y'     -- 마케팅 수신 동의 여부 (Y/N)
);
CREATE SEQUENCE BRUSER_seq;

*/