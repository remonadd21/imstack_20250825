package com.company.java007_ex;

public class UpgradeArray001 {
	public static void main(String[] args) {
		
		/*
		패키지명: com.company.java006_ex 
		클래스명: ArrayExUpgrade1

		문제 설명
		배열명: answers → 사용자의 답안: 'A', 'C', 'B', 'D', 'A'
		배열명: correct  → 정답: 'A', 'C', 'B', 'A', 'A'
		두 배열을 비교하여 맞은 개수를 출력하세요.
		🧪 출력 예시
		정답을 입력하시오. >   'A', 'C', 'B', 'A', 'A'
		1번: 정답  
		2번: 정답  
		3번: 정답  
		4번: 오답  
		5번: 정답  
		총 맞은 개수: 4개
		*/
		
		Character [] ans = {'A', 'C', 'B', 'D', 'A'}; 
		Character [] cor = {'A', 'C', 'B', 'A', 'A'};
		
		String cnt= "";
		
		for(int i=0; i<ans.length; i++) {
			if(cor[i].equals(ans[i])) {
				cnt="정답";
				System.out.println(i+"번: "+cnt);
			}
			else {
				cnt="오답";
				System.out.println(i+"번: "+cnt);
			}
		}
		

	}
}
