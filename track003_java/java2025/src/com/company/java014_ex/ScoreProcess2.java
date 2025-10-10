package com.company.java014_ex;

class ScoreProcess2 {
		void process_avg(Score2[] std){
			for(Score2 s: std) {
				s.setAvg( (s.getKor() + s.getEng() +s.getMath())/3.0);
			}
		}
		
		void process_pass(Score2[] std) {
			for(Score2 s: std) {
			s.setPass(s.getAvg()<60?"불합격":
				s.getKor()<40 || s.getEng()<40 || s.getMath()<40?"불합격":"합격");
			}
			
		}
	
}
