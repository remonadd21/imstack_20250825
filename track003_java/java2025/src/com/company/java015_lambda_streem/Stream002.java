package com.company.java015_lambda_streem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,7,9,7,5,5,3,2,1,1,6};
		List<Integer> list = Arrays.asList(arr);
		
		// 1단계 - stream
		Stream<Integer> sarr  = Arrays.stream(arr);
		Stream<Integer> slist = list.stream();
		
		// 2단계 - 중간연산
		// boolean java.util.function.Predicate.test( T t )
		// void java.util.function.Consumer.accept( T t )
		sarr.filter(t-> t%2 !=0) // 홀수 필터링
			.distinct()			// 중복제거
			.sorted()			// 정렬	
			.skip(1)			// skip		
		.forEach(t-> {System.out.print(t);} );// 3단계 - 최종연산
		
		System.out.println();
		
		slist.filter(t-> t%2 !=0) // 홀수 필터링
		.distinct()			// 중복제거
		.sorted()			// 정렬	
		.skip(1)			// skip		
		.forEach(t-> {System.out.print(t);} );// 3단계 - 최종연산
		
		// 3. collect
		System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
		System.out.println(list.stream().collect(Collectors.toList()));
	}

}
