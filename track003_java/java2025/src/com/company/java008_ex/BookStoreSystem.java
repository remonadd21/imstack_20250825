package com.company.java008_ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BookStoreSystem {

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void bookLookup(String[][] reservations) {
        System.out.print("📖 고객 이름을 입력하세요: ");
        String name = scan();

        for (int i = 0; i < reservations.length; i++) {
            if (name.equals(reservations[i][0])) {
                System.out.println("=======================================\n"
                        + reservations[i][0] + "님은 '" + reservations[i][2] + "' 도서를 예약하셨습니다.\n"
                        + "=======================================");
                break;
            }
        }
    }

    public static void bookUpdate(String[][] reservations) {
        System.out.print("📖 고객 이름을 입력하세요: ");
        String name = scan();

        System.out.print("📞 고객 전화번호를 입력해주세요: ");
        String tel = scan();

        for (int i = 0; i < reservations.length; i++) {
            if (name.equals(reservations[i][0]) && tel.equals(reservations[i][1])) {
                System.out.print("📚 변경하실 도서명을 입력해주세요: ");
                String book = scan();
                reservations[i][2] = book;

                System.out.println("✅ 예약 정보 확인: [고객명:" + reservations[i][0] + ", 전화번호:" + reservations[i][1] + ", 도서:" + reservations[i][2] + "]");
                break;
            }
        }
    }

    public static void newReservation(String[][] reservationPlus) {
        String book = "";
        int find = -1;

        System.out.print("📖 고객 이름을 입력하세요: ");
        String name = scan();

        System.out.print("📞 고객 전화번호를 입력해주세요: ");
        String tel = scan();

        for (int i = 0; i < reservationPlus.length; i++) {
            if (name.equals(reservationPlus[i][0]) && tel.equals(reservationPlus[i][1])) {
                System.out.println("해당하는 정보가 있습니다. 확인해주세요");
                find = i;
                break;
            }
        }

        if (find == -1) {
            System.out.print("=======================\n📚 예약할 도서명을 입력해주세요: ");
            book = scan();
        } else {
            System.out.println("=======================\n해당 정보가 있습니다.\n정보를 확인해 주세요.\n=======================");
        }

        reservationPlus[3][0] = name;
        reservationPlus[3][1] = tel;
        reservationPlus[3][2] = book;

        System.out.println("✅ 예약 정보 확인: [고객명:" + reservationPlus[3][0] + ", 전화번호:" + reservationPlus[3][1] + ", 도서:" + reservationPlus[3][2] + "]");
    }

    public static void showReservations(String[][] reservationPlus) {
        for (int i = 0; i < reservationPlus.length; i++) {
            for (int j = 0; j < reservationPlus[i].length; j++) {
                System.out.print(reservationPlus[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void randomBookRecommendation() {
        String[] books = {"달타냥", "향수", "삼국지", "해리포터", "어린왕자", "퇴마록", "데미안"};
        Random rand = new Random();
        int result = rand.nextInt(books.length);

        System.out.println("===============\n📚 추천 도서: " + books[result] + "\n===============");
    }

    public static void main(String[] args) {
        String[][] reservations = {
                {"민재", "010-1234-5678", "초한지"},
                {"효뿡", "010-2345-6789", "달타냥"},
                {"성희", "010-3456-7890", "이상한 나라의 엘리스"}
        };

        String[][] reservationPlus = new String[reservations.length + 1][];
        for (int i = 0; i < reservations.length; i++) {
            reservationPlus[i] = reservations[i];
        }
        reservationPlus[reservations.length] = new String[]{"예약가능", "예약가능", "예약가능"};

        String sel;
        boolean i = true;

        while (i) {
            System.out.println("📚 서점 예약 시스템 메뉴\n1. 도서 예약 조회\n2. 도서 예약 변경\n3. 신규 예약 등록\n4. 전체 예약 목록\n5. 추천 도서\n9. 종료");
            System.out.print("👉 메뉴 번호를 선택해주세요: ");
            sel = scan();

            switch (sel) {
                case "1":
                    System.out.println("1. 도서 예약 조회");
                    bookLookup(reservations);
                    break;
                case "2":
                    System.out.println("2. 도서 예약 변경");
                    bookUpdate(reservations);
                    break;
                case "3":
                    System.out.println("3. 신규 예약 등록");
                    newReservation(reservationPlus);
                    break;
                case "4":
                    System.out.println("4. 전체 예약 목록");
                    showReservations(reservationPlus);
                    break;
                case "5":
                    System.out.println("5. 추천 도서");
                    randomBookRecommendation();
                    break;
                case "9":
                    System.out.println("👋 시스템을 종료합니다. 안녕히 가세요!");
                    i = false;
                    break;
            }
        }
    }
}
