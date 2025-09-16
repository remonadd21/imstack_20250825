package com.company.java005_ex;

import java.util.Scanner;

public class NutManager {
    public static void main(String[] args) {

        // 변수
        int menu = 0, age = 0, errorCount = 0;
        double price = 0;
        String[] nutData = {"nutName", "origin", "confirm", "info"};

        Scanner scanner = new Scanner(System.in);

        // 반복 메뉴
        for (;;) {
            System.out.println("\n🥜 Welcome to NutManager 🥜\n============================");
            System.out.println("(1) 견과류 등록\n(2) 견과류 정보 조회\n(3) 가격 수정\n(4) 할인 적용\n(5) 견과류 삭제\n(9) 종료하기\n============================");
            System.out.print("메뉴 번호를 선택하세요: ");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("견과류 이름 입력: ");
                nutData[0] = scanner.next();

                System.out.print("원산지 입력: ");
                nutData[1] = scanner.next();

                do {
                    System.out.print("관리자 나이 입력 (19~100세): ");
                    age = scanner.nextInt();
                } while (!(age >= 19 && age <= 100));

                System.out.print("가격 입력 (원): ");
                price = scanner.nextDouble();
            }

            else if (menu == 2 || menu == 3 || menu == 4 || menu == 5) {
                int action = 0;

                System.out.print("견과류 이름 확인: ");
                String nameCheck = scanner.next();

                System.out.print("원산지 확인: ");
                String originCheck = scanner.next();

                if (nameCheck.equals(nutData[0]) && originCheck.equals(nutData[1])) {
                    action = menu;
                } else {
                    errorCount++;
                    System.out.println("정보가 일치하지 않습니다. (" + errorCount + "회 실패)");
                    if (errorCount == 3) {
                        System.out.println("\n관리자에게 문의하세요: 080-1234-5678");
                        break;
                    }
                }

                switch (action) {
                    case 2:
                        double discount = 0;
                        nutData[3] = "";

                        if (price >= 10000 && price < 50000) {
                            discount = price * 0.05;
                            System.out.println("5% 할인 적용됨");
                        } else if (price >= 50000) {
                            discount = price * 0.10;
                            System.out.println("10% 할인 적용됨");
                        } else {
                            System.out.println("할인 없음");
                        }

                        nutData[3] = "견과류: " + nutData[0] + " / 원산지: " + nutData[1] + " / 관리자 나이: " + age +
                                     " / 할인액: " + discount + "원 / 최종 가격: " + (price - discount) + "원";
                        System.out.println(nutData[3]);
                        break;

                    case 3:
                        System.out.print("새 가격 입력: ");
                        price = scanner.nextDouble();
                        System.out.println("가격이 수정되었습니다. 현재 가격: " + price + "원");
                        break;

                    case 4:
                        System.out.print("할인율 입력 (%): ");
                        double rate = scanner.nextDouble();
                        double finalPrice = price - (price * rate / 100);
                        System.out.println("할인 적용 완료. 최종 가격: " + finalPrice + "원");
                        price = finalPrice;
                        break;

                    case 5:
                        for (;;) {
                            System.out.print("견과류 정보를 삭제하시겠습니까? (Y/N): ");
                            nutData[2] = scanner.next();
                            if (nutData[2].equalsIgnoreCase("n")) {
                                System.out.println("메뉴로 돌아갑니다.");
                                break;
                            } else if (nutData[2].equalsIgnoreCase("y")) {
                                nutData[0] = ""; nutData[1] = ""; nameCheck = ""; originCheck = ""; price = 0;
                                System.out.println("견과류 정보가 삭제되었습니다.");
                                break;
                            } else {
                                System.out.println("Y 또는 N을 입력해주세요.");
                            }
                        }
                }
            } else if (menu == 9) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
