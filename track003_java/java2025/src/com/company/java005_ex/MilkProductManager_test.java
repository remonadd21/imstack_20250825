package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MilkProductManager_test {
    public static void main(String[] args) {
        // 우유 제품 정보 저장
        String[] productName = new String[3];   // 예: 딸기우유, 초코우유, 바나나우유
        double[] price = new double[3];         // 예: 1500.0, 1800.0, 1700.0
        
        int[][] sav = {
        					{11,27,100,33},
        					{58,20,20,57},
        					{32,10,51,82},
        				}; 
        
        int[][] res = new int [sav.length+1][sav[0].length+1];
        
        
        
        int num = -1;
        Scanner scanner = new Scanner(System.in);

        while (num != 9) {
            System.out.println(Arrays.toString(productName));
            System.out.println(Arrays.toString(price));
   
            System.out.print("\n\n🥛 WELCOME TO MILK PRODUCT SYSTEM 🥛\n" +
                    "\n[1] ➕ 우유 제품 추가" +
                    "\n[2] 🔍 제품 조회" +
                    "\n[3] 💰 가격 변경" +
                    "\n[4] 🗑️ 제품 삭제" +
                    "\n[5] 보유 현황"+
                    "\n[9] ❌ 종료" +
                    "\n\n👉 번호를 선택하세요: ");
            num = scanner.nextInt();

            if (num == 1) {
                int find = -1;
                for (int i = 0; i < productName.length; i++) {
                    if (productName[i] == null) {
                        find = i;
                        break;
                    }
                }
                if (find == -1) {
                    System.out.println("더 이상 제품을 추가할 수 없습니다.");
                    continue;
                }

                System.out.println("[1] 제품 이름 입력> ");
                productName[find] = scanner.next();
                System.out.println("[2] 가격 입력> ");
                price[find] = scanner.nextDouble();

            } else if (num == 2 || num == 3 || num == 4 ) {
                int find = -1;
                System.out.println("[1] 제품 이름 입력> ");
                String tempName = scanner.next();

                for (int i = 0; i < productName.length; i++) {
                    if (tempName.equals(productName[i])) {
                        find = i;
                        break;
                    }
                }

                if (find == -1) {
                    System.out.println("제품 정보를 확인해 주세요!");
                    continue;
                }

                switch (num) {
                    case 2:
                        System.out.println("\n[1]🥛제품 이름 > " + productName[find] +
                                "\n[2]🧃가격 > " + price[find] + "원");
                        break;

                    case 3:
                        System.out.println("🥛변경할 가격 입력 > ");
                        double newPrice = scanner.nextDouble();
                        price[find] = newPrice;
                        System.out.println("💰가격이 변경되었습니다.");
                        break;

                    case 4:
                        System.out.println("🗑️정말 삭제하시겠습니까? (Y/N) > ");
                        if (scanner.next().toLowerCase().equals("y")) {
                            productName[find] = null;
                            price[find] = 0;
                            System.out.println("👉 삭제 완료!");
                        } else {
                            System.out.println("삭제 취소됨.");
                        }
                        break;
                     
                }
            }
            else if(num == 5) { System.out.println("재고 현황입니다."); 
                
            		
            		
            		//2. sav 데이터 res에 덮기 
            		// 입력되는 데이터 길이 값 보여주기
		        for(int ch=0; ch<sav.length; ch++) {
		                for(int kan=0; kan<sav[ch].length; kan++) {
		                		res[ch][kan] = sav[ch][kan];
		                }
		                System.out.println();
		         }
		        
		        // 가로 방향 처리
		        
           
            		//1. 기본 데이터 출력
		        	for(int ch=0; ch<res.length; ch++) {
		                for(int kan=0; kan<res[ch].length; kan++) {
		                		
		                		// 결과값 화면 보여주기
		                		System.out.print(res[ch][kan]+"\t");
		                }
		                System.out.println();
		         }
            		
            		
            		
    
               
            
            } else if (num == 9) {
                System.out.println("❌프로그램을 종료합니다.");
            } else {
                System.out.println("메뉴를 확인해 주세요.");
            }
        }
    }
}
