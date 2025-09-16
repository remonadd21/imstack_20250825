package com.company.java007_ex;

import java.util.Scanner;

public class Array2Ex002_upgrade1_ex{ 
    public static void main(String[] args) {
       int[][] seats = {
               {0, 1, 0, 0},
               {1, 0, 0, 1},
               {0, 0, 1, 0}
           };

        Scanner sc = new Scanner(System.in);
        System.out.print("예약할 좌석의 행 번호 입력 (0~2): ");
        int row = sc.nextInt();
        System.out.print("예약할 좌석의 열 번호 입력 (0~3): ");
        int col = sc.nextInt();

        if (seats[row][col] == 1) {
            System.out.println("이미 예약된 좌석입니다.");
        } else {
            seats[row][col] = 1;
            System.out.println("예약되었습니다.");
        }

        System.out.println("\n현재 좌석 상태:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    } 
}