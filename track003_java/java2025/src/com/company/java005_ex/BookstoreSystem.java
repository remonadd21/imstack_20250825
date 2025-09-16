package com.company.java005_ex;
import java.util.Arrays;
import java.util.Scanner;

public class BookstoreSystem {
    public static void main(String[] args) {
        // 변수 선언
        String[] bookTitle = new String[3];   // 예: "자바의 정석", "Clean Code", "Effective Java"
        String[] author = new String[3];      // 예: "남궁성", "Robert C. Martin", "Joshua Bloch"
        double[] price = new double[3];       // 예: 35000, 42000, 39000
        int num = -1, find = -1;
        Scanner scanner = new Scanner(System.in);

        // 입력 + 처리 + 출력
        while (num != 9) {
            System.out.println(Arrays.toString(bookTitle));
            System.out.println(Arrays.toString(author));
            System.out.println(Arrays.toString(price));

            // 메뉴 출력
            System.out.print("\n📚✨ WELCOME TO BOOKSTORE SYSTEM ✨📚\n" +
                    "\n[1] 📘 책 등록" +
                    "\n[2] 🔍 책 조회" +
                    "\n[3] 💰 가격 수정" +
                    "\n[4] 🗑️ 책 삭제" +
                    "\n[9] ❌ 종료" +
                    "\n\n👉 번호를 선택하세요: ");
            num = scanner.nextInt();

            if (num == 1) {
                // 빈 공간 찾기
                for (int i = 0; i < bookTitle.length; i++) {
                    if (bookTitle[i] == null) {
                        find = i;
                        break;
                    }
                }

                if (find != -1) {
                    System.out.print("책 제목 입력> ");
                    bookTitle[find] = scanner.next();
                    System.out.print("저자 입력> ");
                    author[find] = scanner.next();
                    System.out.print("가격 입력> ");
                    price[find] = scanner.nextDouble();
                } else {
                    System.out.println("책 저장 공간이 부족합니다.");
                }

            } else if (num == 2) {
                System.out.print("조회할 책 제목 입력> ");
                String searchTitle = scanner.next();
                boolean found = false;

                for (int i = 0; i < bookTitle.length; i++) {
                    if (searchTitle.equals(bookTitle[i])) {
                        System.out.println(">> 제목: " + bookTitle[i] + " / 저자: " + author[i] + " / 가격: " + price[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("책을 찾을 수 없습니다.");
                }

            } else if (num == 3) {
                System.out.print("가격 수정할 책 제목 입력> ");
                String updateTitle = scanner.next();
                boolean updated = false;

                for (int i = 0; i < bookTitle.length; i++) {
                    if (updateTitle.equals(bookTitle[i])) {
                        System.out.print("새 가격 입력> ");
                        price[i] = scanner.nextDouble();
                        System.out.println("가격이 수정되었습니다.");
                        updated = true;
                        break;
                    }
                }

                if (!updated) {
                    System.out.println("책을 찾을 수 없습니다.");
                }

            } else if (num == 4) {
                System.out.print("삭제할 책 제목 입력> ");
                String deleteTitle = scanner.next();
                boolean deleted = false;

                for (int i = 0; i < bookTitle.length; i++) {
                    if (deleteTitle.equals(bookTitle[i])) {
                        bookTitle[i] = null;
                        author[i] = null;
                        price[i] = 0;
                        System.out.println("책이 삭제되었습니다.");
                        deleted = true;
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("책을 찾을 수 없습니다.");
                }

            } else if (num == 9) {
                System.out.println("📕 시스템을 종료합니다.");
            } else {
                System.out.println("메뉴를 확인해주세요.");
            }
        }
    }
}
