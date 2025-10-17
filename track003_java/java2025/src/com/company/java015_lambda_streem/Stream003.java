package com.company.java015_lambda_streem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream003 {
	public static void main(String[] args) {
		
		Integer[] ages= {17, 21, 26, 45, 18};
		
		// ex1
		double avg = Arrays.stream(ages)
			  .mapToInt(age -> age)		// 객체는 기본값
			  .average()				// 평균값
			  .orElse(0.0);				// 값 없으면 0.0
		
		System.out.println("평균나이: "+avg);
		
		// ex2
		// step1) 스트림 만들기
		Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		Stream<Integer> numb = Arrays.stream(nums);
		// step2) 짝수 필터링 - fillter 이용
		// step3) forEach 출력
		numb.filter(t-> t%2 !=0) // 홀수 필터링
		.sorted()			// 정렬	
		.forEach(t-> {System.out.print(t);} );// 3단계 - 최종연산
		
		System.out.println();
		//ex
	      //Ex3  성이 김씨인친구들
	      List<String> names = Arrays.asList("김수지" , "이나영" , "김나영" , "유재석" , "강호동");
	      // 힌트) 문자열에서 startWith("문자") 시작하는
	      
	      //1) 스트림 만들기
		  names.stream()
		  .filter(t-> t.startsWith("김")) // 2) 김으로 시작하는 값 filter로 찾기 
		  .sorted()				// 3) 정렬				
		  .forEach(System.out::println); // 4) forEach로 출력 
		  
		  // 5) 나이가 제일 많은 사람
		  // 1) 스트림 만들기, 2) 객체를 숫자로, 3)최대값, 4) 못찾으면 -1
		  int max = Arrays.stream(ages).mapToInt(age->age).max().orElse(-1);
		  System.out.println(max);
	}
}
