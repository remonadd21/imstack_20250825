package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ing {
	public static void main(String[] args) {
		
			
		//변수
		int num=0, age=0, count=0;
		double money=0;
		char end9 ='\u0000';
		String ids="", pws="",chk="", res="";
		
		//입력
		Scanner scanner = new Scanner(System.in);
			
			
		// 처리 : 반복메뉴
		for(;;) {
			System.out.println("\n💳 Welcome to Bank_ing 💳\n ===========================");
			System.out.println("(1) 계좌 추가\n(2) 내 정보 조회\n(3) 입금하기\n(4) 출금하기\n(5) 계좌 삭제\n(9) 종료하기\n===========================");
			System.out.print("서비스 번호를 눌러 주세요: ");
			num = scanner.nextInt();
			
			
			if(num==1) {	
				System.out.print("아이디 입력: ");
				// .toString() 안 붙여도 됨
				// ids = scanner.next().toString();
				ids = scanner.next();
				
				System.out.print("비밀번호 입력: ");
				pws = scanner.next();
				
				do {
				System.out.print("나이입력 (19~100세): ");
				age = scanner.nextInt();
				}while(!(age>=19 && age<=100));
				
				System.out.print("잔액입력: ");
				money = scanner.nextInt();
			}// if end 1
		
			else if(num==2 || num==3 || num==4 || num==5) {
				
				int num2 = 0;
				
				
				System.out.print("아이디 입력: ");
				String ids2 = scanner.next();
				
				System.out.print("비밀번호 입력: ");
				String pws2 = scanner.next();
			
				
				
				if(ids2.equals(ids) && pws2.equals(pws)) {num2=num;}
				else {
					count++;
					System.out.println("고객님 "+count+"번 틀리셨습니다.");
					if(count==3) {
						System.out.println("\n고객센터에 문의하세요.\n1234-8900");
						break;
					}
				}
				
		
				
				
				switch(num2) {
					case 2: res+="아이디:"+ids+"/나이:"+age+"/잔액:"+money+"원"; 
						System.out.println(res); break;
					
					case 3: System.out.print("입금할 금액을 입력하세요: ");
							money+= scanner.nextInt();
							System.out.println("입금완료");
							System.out.print("잔액: "+money+"원\n");
							break;
					
					case 4:System.out.print("출금할 금액을 입력하세요: ");
						// 마이너스 금액 남지 않도록 만듬
						double tempmoney = scanner.nextInt();			
						res+=((tempmoney > money)?"잔액이 "+money+"원으로 출금이 불가능 합니다.":"출금 완료, 잔액: "+(money=money-tempmoney)+"원");
						System.out.println(res);
						break;
					
					case 5:
						for(;;) {	
							System.out.print("계좌를 삭제 하시겠습니까? ");
							chk = scanner.next();
							if(chk.equals("n") || chk.equals("N") ) {
								System.out.println("메뉴로 돌아갑니다.");
								break;
						}
						else if(chk.equals("y") || chk.equals("Y") ) {
							System.out.println("계좌를 삭제합니다.");
							ids=""; pws=""; ids2=""; pws2=""; money=0;
							System.out.println("계좌가 삭제되었습니다.");
							break;
						}
						else {System.out.println("Y 또는 N을 입력해주세요.");}
						}
						
							
				}//end switch
			}//end else if
			else if(num==9) {System.out.println("종료 합니다."); break;}
		
		
		}//end for
	}
}
