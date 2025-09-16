package com.company.java007_ex;

public class Re03_array_test {
	public static void main(String[] args) {
			
		/*
		> 배열 응용
		1. 배열명 nums  10, 20, 30 넣기
		2. for문과 length를  이용하여 10, 20, 30 출력받기
		*/
		
		//변수
		int [] nums = {10, 20, 30};
		int data=10;
		
		//입력
		//처리
		//출력
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=data; data+=10;
			System.out.print(((nums[i]==10)?"":",")+nums[i]);
		}
		
	}
}
