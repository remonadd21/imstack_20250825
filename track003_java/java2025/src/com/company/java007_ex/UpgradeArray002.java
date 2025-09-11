package com.company.java007_ex;

import java.util.Scanner;

public class UpgradeArray002 {
	public static void main(String[] args) {
		/*
		패키지명: com.company.java006_ex 
		클래스명: ArrayExUpgrade2
		문제 설명
		배열명: temperatures → 
		         하루 동안의 시간별 온도 변화: [22, 24, 25, 23, 21, 20, 19, 21] 

		배열을 순회하면서 기준 온도보다 높은 경우는 "상승", 낮은 경우는 "하락", 같은 경우는 "유지"로 출력하세요. 
		그리고 전체 중 "상승"한 횟수를 출력하세요.

		🧪 출력 예시 
		기준 온도: 22도  
		1시간차: 유지  
		2시간차: 상승  
		3시간차: 상승  
		4시간차: 상승  
		5시간차: 하락  
		6시간차: 하락  
		7시간차: 하락  
		8시간차: 상승  
		총 상승 횟수: 4회
		*/
		
		
		int [] temperatures = {22, 24, 25, 23, 21, 20, 19, 21};
		
		int data=22;
		String chk="";
		
		for(int i=0; i<temperatures.length; i++) {
			
			if(temperatures[i]==data) {
				chk="유지";
				System.out.println((i+1)+"시간차: "+chk);
			}
			else if(temperatures[i]>data) {
				chk="상승";
				System.out.println((i+1)+"시간차: "+chk);
			}
			else {
				chk="하락";
				System.out.println((i+1)+"시간차: "+chk);
			}
			
		}
		
		
	}
}


