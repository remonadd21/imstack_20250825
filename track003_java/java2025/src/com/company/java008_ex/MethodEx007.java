package com.company.java008_ex;


public class MethodEx007{
    public static int add(int x, int y) {return x+y;} //1
    public static int  add(byte x, byte y)   {return x+y;} //2   
    public static int  add(short x, short y) {return x+y;} //3   
//    public static long add(int  x, int y)    {return x+y;} //4  
    public static long add(long  x, long y)  {return x+y;} //5 
    
   public static void main(String[] args) {
      //Q1. 메서드오버로딩?
      //Q2. 왜오류? 이유달기
	  //		1, 4 오류 남! 오버로딩은 리턴값은 보지 않고, 
	  //		파라미터를 보는데 1번과 4번의 파라미터의 자료형이 같음
   } 
}