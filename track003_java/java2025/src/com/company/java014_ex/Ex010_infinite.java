package com.company.java014_ex;

import java.util.Scanner;

public class Ex010_infinite {

    public static int nextInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 1입력받기: ");
        return scanner.nextInt();
    }


	public static void main(String[] args) {

		System.out.println("1) while 버전");
	    int one=0;
	    boolean t = true;
	    while(t){
	        one = nextInt();
	        if(one==1){/*break;*/ t=false;}
	    }
		
		
		System.out.println("2) do while 버전");
//		int num=0;
//		do {
//			 num = nextInt();
//		}while( !(num==1) );
		
		
		System.out.println("3) for 버전");
//		int num =0;
//		for(;;) {
//			num = nextInt();
//			if(num==1) {break;}
//		}
		
	
	}// end main
}// end class
