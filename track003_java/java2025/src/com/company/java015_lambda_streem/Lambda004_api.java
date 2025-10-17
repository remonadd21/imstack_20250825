package com.company.java015_lambda_streem;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {

	public static void main(String[] args) {
		// ()->{}
		// void java.util.function.Consumer.accept( T t )/(T t)->{리턴값 없음}
		// Consumer<String> consumer = (t)->{System.out.println("hello "+t)}
		Consumer<String> consumer = System.out::println;
		consumer.accept("brad");
		consumer.accept("lambda");
		
		// T java.util.function.Supplier.get() /()->{ return } / get
		// Supplier<String> supplier = ()->{return "Good day"; };
		Supplier<String> supplier = ()-> "Good day"; 
		System.out.println(supplier.get());
		
		
		
		//boolean java.util.function.Predicate.test( T t ) 
		// 	( T t ) ->{return boolean} / test
		//Predicate<Integer> predicate = (t)->{return t<0;};
		Predicate<Integer> predicate = t-> t<0;
		System.out.println(predicate.test(10)); 
		System.out.println(predicate.test(-10)); 
		
		
		//R java.util.function.Function.apply( T t )
		// 	( T t ) ->{return R} / apply
		//Function<String, Integer> function= (t)->{return Integer.parseInt(t)};
		//Function<String, Integer> function= t->Integer.parseInt(t);
		
		Function<String, Integer> function= Integer::parseInt;
		System.out.println(function.apply("10")+3);
		
		//int java.util.function.IntBinaryOperator.applyAsInt( int left, int right )
		// ( int left, int right )-> int / applyAsInt
		//IntBinaryOperator operator = (int left, int right)->{return left>right? left:right; };
		IntBinaryOperator operator = (left, right)-> left>right? left:right;

		System.out.println(operator.applyAsInt(10, 3));
		System.out.println(operator.applyAsInt(3, 33));

	}

}
/*
자바의 api 함수형 인터페이스 

1. Consumer 받는용도 /accept( T t ) / (T t)->{리턴값 없음}
2. Supplier 제공용도
3. Predicate 판단용도
4. Function 처리용도
5. Operator 연산용도

*/