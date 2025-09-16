package com.company.java005_ex; 

import java.util.Arrays;
import java.util.Scanner;

public class FootballWarningTracker {
    public static void main(String[] args) {
        String[] playerName = new String[3];     // 선수 이름
        String[] teamName = new String[3];       // 팀 이름
        int[] warnings = new int[3];             // 경고 수

        int menu = -1, slot = -1;
        Scanner scanner = new Scanner(System.in);

        while (menu != 9) {
            System.out.println(Arrays.toString(playerName));
            System.out.println(Arrays.toString(teamName));
            System.out.println(Arrays.toString(warnings));

            System.out.print("\n⚽ FOOTBALL WARNING TRACKER ⚽\n" +
                    "\n[1] 📝 선수 등록" +
                    "\n[2] 🔍 경고 조회" +
                    "\n[3] 🟨 경고 추가" +
                    "\n[4] 🧹 경고 초기화" +
                    "\n[5] ❌ 선수 삭제" +
                    "\n[9] 🚪 시스템 종료" +
                    "\n\n📌 메뉴를 선택하세요: ");
            menu = scanner.nextInt();

            if (menu == 1) {
                for (int i = 0; i < playerName.length; i++) {
                    if (playerName[i] == null) {
                        slot = i;
                        break;
                    }
                }

                System.out.print("👤 선수 이름 입력> ");
                playerName[slot] = scanner.next();
                System.out.print("🏟️ 팀 이름 입력> ");
                teamName[slot] = scanner.next();
                System.out.print("🟨 초기 경고 수 입력> ");
                warnings[slot] = scanner.nextInt();

                System.out.println("✅ 선수 등록 완료!");
            } else if (menu >= 2 && menu <= 5) {
                System.out.print("👤 선수 이름 입력> ");
                String tempName = scanner.next();
                System.out.print("🏟️ 팀 이름 입력> ");
                String tempTeam = scanner.next();
                
                // 선수가 인증됐는지 아닌지 true, false로 확인
                boolean oks = false;
                int target = -1;

                for (int i = 0; i < playerName.length; i++) {
                    if (tempName.equals(playerName[i]) && tempTeam.equals(teamName[i])) {
                        oks = true;
                        target = i;
                        break;
                    }
                }

                if (!oks) {
                    System.out.println("❌ 인증 실패: 선수 정보를 확인해주세요.");
                    continue;
                }

                switch (menu) {
                    case 2:
                        System.out.println("📋 선수 경고 정보:");
                        System.out.println("이름: " + playerName[target]);
                        System.out.println("팀: " + teamName[target]);
                        System.out.println("경고 수: " + warnings[target]);
                        break;

                    case 3:
                        System.out.print("🟨 추가할 경고 수> ");
                        int addWarning = scanner.nextInt();
                        warnings[target] += addWarning;
                        System.out.println("✅ 경고가 추가되었습니다.");
                        if (warnings[target] >= 2) {
                            System.out.println("🚫 누적 경고 "+warnings[target]+"회! 퇴장 대상입니다.");
                        }
                        break;

                    case 4:
                        warnings[target] = 0;
                        System.out.println("🧹 경고가 초기화되었습니다.");
                        break;

                    case 5:
                        System.out.print("❓ 선수 정보를 삭제하시겠습니까? (y/n)> ");
                        String confirm = scanner.next();
                        if (confirm.equalsIgnoreCase("y")) {
                            playerName[target] = null;
                            teamName[target] = null;
                            warnings[target] = 0;
                            System.out.println("🗑️ 선수 정보가 삭제되었습니다.");
                        } else {
                            System.out.println("🚫 삭제 취소됨.");
                        }
                        break;
                }
            } else {
                System.out.println("⚠️ 메뉴 번호를 확인해주세요.");
            }
        }

        System.out.println("👋 시스템 종료. 경기 로그가 저장되었습니다.");
    }
}
