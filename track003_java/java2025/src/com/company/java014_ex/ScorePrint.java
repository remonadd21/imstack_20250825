package com.company.java014_ex;

class ScorePrint{
	void title() {
		System.out.println("###################################################");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n","이름","국어","영어","수학","평균","합격여부");
	}
	void show(Score2 [] std) {
		for(Score2 s: std) {
			System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\n",
					s.getName(),s.getKor(),s.getEng(),s.getMath(), s.getAvg(), s.getPass());

		}
	}
}