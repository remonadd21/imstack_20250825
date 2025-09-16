package com.company.java005_ex; 
import java.util.Arrays;
import java.util.Scanner;

public class Bank002_1_Array {
   public static void main(String[] args) {
      //변수                          0   1    2
      String [] id=new String[3];       //  one two three
      String [] pass = new String[3];   // 1111 2222 3333
      double []money = new double[3];// 1100 2200 3300   
      int num=-1, find=-1;  
      Scanner scanner = new Scanner(System.in);
     
      //입력 + 처리 + 출력
      while( num !=9 ) {   // 9가아니라면 계속 무한반복
         System.out.println( Arrays.toString(id));
         System.out.println( Arrays.toString(pass));
         System.out.println( Arrays.toString(money));
          //■기능 1. 메뉴판
          System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
             +"\n\n👉 번호를 선택하세요:"
          );  
          num= scanner.nextInt();
          
          
          
          if( num==1 ) { 
                // 1-1 빈칸 확인 한 후 find
                // ver-1  if(0번이 빈칸이라면) {find는 1}
                // ver-2  if(0번이 null이라면){find는 1}
                // ver-3 if(id[0]==0){ find=1;}
             
           
                // find는 해당하는 공간에 해당하는 값을 담을 수 있음
                // find 없는 공간을 이용하기 위하여 -1부터 시작
        	  		// 중요! find는 현재 입력받은 데이터를 유지함!
             
                for(int i=0; i<id.length; i++) {
                   if( id[i] == null) {find=i;  break;}
                }
                           
       
                System.out.print("아이디 입력> "); id[find] = scanner.next();               
                System.out.print("비밀번호 입력> "); pass[find] = scanner.next();
                System.out.print("금액입력> "); money[find] = scanner.nextDouble();
                
                
             }
             else if (num == 2 || num == 3 || num == 4 || num == 5) {
              switch(num){
                case 2 : 
                   
                   // 임시 입력
                   System.out.print("아이디 입력> "); String temID = scanner.next();               
                   System.out.print("비밀번호 입력> "); String temPW = scanner.next();
                   
                   // 처리 , 출력
                   for(int i=0; i<id.length; i++) {
                      if(temID.equals(id[find]) && temPW.equals(pass[find])) {
                         System.out.println(">> 아이디: "+id[i]+"/ 비밀번호: "+pass[i]+"/ 잔액: "+money[i]);  
                         break;
                      }
                      else {
                    	  	System.out.println("정보를 확인해 주세요.");
                         break;
                      }
                   }
                break;
               
                case 3 : 
                   
                   // 입력
                    System.out.print("아이디 입력> ");  temID = scanner.next();               
                    System.out.print("비밀번호 입력> ");  temPW = scanner.next();

                      
                   for(int i=0; i<id.length; i++) {
                	   	if(temID.equals(id[find]) && temPW.equals(pass[find])) {
                       System.out.print("입금할 금액 > "); 
	                   double input = scanner.nextDouble();   
	                   money[i]+=input; 
	                   break;
                      }
                      else {
                         System.out.println("정보를 확인해 주세요.");
                         break;
                      }
                   }
                   
                break;
                
                case 4 : 
                   
                   // 입력
                	  System.out.print("아이디 입력> ");  temID = scanner.next();               
                  System.out.print("비밀번호 입력> ");  temPW = scanner.next();
                      
                   for(int i=0; i<id.length; i++) {
                	   	if(temID.equals(id[find]) && temPW.equals(pass[find])) {
                       System.out.print("출금할 금액 > "); 
	                   double input = scanner.nextDouble();   
	                   money[i]-=input; 
	                   break;
                      }
                      else {
                         System.out.println("정보를 확인해 주세요.");
                         break;
                      }
                   }
                   
                   
                break;
                case 5 : 
            
               System.out.println("삭제하시겠습니까?"); 
               String answer = scanner.next();
               if(!answer.toLowerCase().equals("y")) { System.out.println("삭제를 취소했습니다.");
               continue; } 
               for(int i=0; i<id.length; i++) { 
                  id[find]=null; 
                  pass[find]=null; 
                  money[find]=0;
                  break;
               } System.out.println("삭제를 완료했습니다.");
            
                    break;
          
               }
             }
          else{  System.out.println("메뉴를 확인해주세요. ");    }
         }
   }// end main
}//end class

/*
for(;;){ 무한반복
   ■기능 1. 메뉴판
   ■기능 2. 
        if(9){ 빠져나오기   }
   else if(1){ 사용자에게 추가}
   else if(2,3,4,5){ 
      ■1. 사용자 인증
       2. 2,3,4,5 각각에 해당하는 처리
          switch(){
             case 2 : 정보출력 break;
             case 3 : 입금 break;
             case 4 : 출금 break;
             case 5 : 삭제 break;
          }
   } // end else if
}// end for

*/