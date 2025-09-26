package com.company.java011_ex;

public class Score {

	private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	public Score() {super();}
	public Score(String name, int kor, int eng, int math) { 
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	public Score(String name, int kor, int eng, int math, int total, double aver, String p, String s, String rank) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.aver = aver;
		this.p = p;
		this.s = s;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	/////////////// 총점 계산하기
	public int getTotal() {
		
		return this.kor+this.eng+this.math;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	//////////////////////////////////
	
	/////////////// 평균 계산하기
	public double getAver() {
		return this.getTotal()/3.0;
	}
	
	public void setAver(double aver) {
		this.aver = aver;
	}
	//////////////////////////////////
	
	//////////////// 합격여부
	public String getP() {
		
		return this.getAver()<60?"불합격":this.kor<40 || this.eng<40 || this.math<40?"불합격":"합격";
	}
	public void setP(String p) {
		this.p = p;
	}
	//////////////////////////////////
	
	////////////////장학생
	public String getS() {
		return this.getAver()>=95?"장학생":"--";
	}
	public void setS(String s) {
		this.s = s;
	}
	//////////////////////////////////

	////////////////랭킹
	public String getRank() {
		
		int num = (int) this.getAver()/10;
		this.rank ="";
		
		for(int i=0; i<num; i++) {
			rank+="★";
		}
		
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	//////////////////////////////////
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}
	
	// 멤버 메서드
	public static void info() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n",
				"이름","국어","영어","수학","총점","평균","합격여부","장학생","랭킹");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

	}
	
	public void show() {
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\n",
				this.name,this.kor,this.eng,this.math,
				this.getTotal(),this.getAver(),this.getP(), this.getS(), this.getRank());
	}
	
}
