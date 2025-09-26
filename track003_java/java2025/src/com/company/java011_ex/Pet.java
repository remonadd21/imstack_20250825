package com.company.java011_ex;

import java.util.Scanner;

public class Pet {
	// 변수
	 private String name;  
	 private int walkTime, snackCount, cuddleCount, moodScore;  
	 private String snackStars, tailWag, todayMessage;  

	 
	 
	 
	 
	public Pet() { super(); }

	public Pet(String name, int walkTime, int snackCount, int cuddleCount) {
		super();
		this.name = name;
		this.walkTime = walkTime;
		this.snackCount = snackCount;
		this.cuddleCount = cuddleCount;
	}

	public Pet(String name, int walkTime, int snackCount, int cuddleCount, int moodScore, String snackStars,
			String tailWag, String todayMessage) {
		super();
		this.name = name;
		this.walkTime = walkTime;
		this.snackCount = snackCount;
		this.cuddleCount = cuddleCount;
		this.moodScore = moodScore;
		this.snackStars = snackStars;
		this.tailWag = tailWag;
		this.todayMessage = todayMessage;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWalkTime() {
		return walkTime;
	}

	public void setWalkTime(int walkTime) {
		this.walkTime = walkTime;
	}

	///////// 간식 주면 10배
	public int getSnackCount() {
		return this.snackCount*10;
	}

	public void setSnackCount(int snackCount) {
		this.snackCount = snackCount;
	}
	/////////////////////

	
	///////// 쓰다듬으면 5배
	public int getCuddleCount() {
		return this.cuddleCount*5;
	}

	public void setCuddleCount(int cuddleCount) {
		this.cuddleCount = cuddleCount;
	}
	/////////////////////

	
	// 행복도처리
	public int happy() {
		return this.walkTime+this.getSnackCount()+this.getCuddleCount();
	}
	///////// 행복도
	public int getMoodScore() {
		return happy();
	}

	public void setMoodScore(int moodScore) {
		this.moodScore = moodScore;
	}
	/////////////////////
	
	//////// 간식보상
	/////4) 간식보상 (snackStars)
	public String getSnackStars() {
		return this.getMoodScore()>=90?"★★★★★":this.getMoodScore()>=70?"★★★★":
			this.getMoodScore()>=50?"★★★":this.getMoodScore()>=30?"★★":"★";
	}

	public void setSnackStars(String snackStars) {
		this.snackStars = snackStars;
	}
	/////////////////////

	
	/////// 꼬리흔들기
	/////5)  꼬리흔들기 (tailWag)
	public String getTailWag() {
		return this.getMoodScore()>=90?"팔짝팔짝":
			this.getMoodScore()>=60?"흔들흔들":
				this.getMoodScore()>=40?"살짝흔들":"꼬리내림";
	}

	public void setTailWag(String tailWag) {
		this.tailWag = tailWag;
	}
	///////////////////
	
	
	///////// 오늘의 멘트
	/////6)  오늘의 멘트 (todayMessage)
	public String getTodayMessage() {
		return this.getMoodScore()>=90?"오늘은 정말 행복했어요!":
			this.getMoodScore()>=60?"좋은 하루였어요!":
			this.getMoodScore()>=40?"조금 더 놀아줘요!":"외로웠어요...";
	}

	public void setTodayMessage(String todayMessage) {
		this.todayMessage = todayMessage;
	}
	////////////////////

	// 멤버 메서드
	public static void info() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t\t%-5s\n",
				"이름","산책시간","간식개수","쓰다듬횟수","행복도","간식보상","꼬리흔들기","오늘의멘트"
		);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

	}
	
	public void show() {
		System.out.printf("%-5s\t%-5d분\t%-5d개\t%-5d회\t%-5d\t%-5s\t%-5s\t\t%-5s\n",
				this.name, this.walkTime, this.snackCount,this.cuddleCount,this.getMoodScore(),this.getSnackStars(),this.getTailWag(),	this.getTodayMessage());
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", walkTime=" + walkTime + ", snackCount=" + snackCount + ", cuddleCount="
				+ cuddleCount + ", moodScore=" + moodScore + ", snackStars=" + snackStars + ", tailWag=" + tailWag
				+ ", todayMessage=" + todayMessage + "]";
	}
	

}
