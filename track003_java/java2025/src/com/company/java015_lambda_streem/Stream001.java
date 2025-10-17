package com.company.java015_lambda_streem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream001 {

	public static void main(String[] args) {
		// 데이터 종류에 상관없이 (Stream)  같은 방식으로 처리
		
		Integer[] arr= {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		
		// Arrays.stream(arr).forEach((t)->{System.out.print(t);});
		Arrays.stream(arr).forEach(System.out::print);
		
		System.out.println();
		//list.stream().forEach((t)->{System.out.println(t);});
		list.stream().forEach(System.out::print);
		// void java.util.function.Consumer.accept( T t )
		// 리턴값 없음 / accept
	}

}
