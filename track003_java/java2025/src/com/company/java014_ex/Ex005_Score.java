package com.company.java014_ex;

// import가 필요할 때
// import com.company.java014_ex.Score;


public class Ex005_Score{
    public static void main(String[] args){
        Score2[] std = new Score2[3];
        std[0] = new Score2("아이언맨", 100,100,100);
        std[1] = new Score2("헐크", 90,60,80);
        std[2] = new Score2("블랙팬서", 20,60,90);

        ScoreProcess2 process = new ScoreProcess2();
        process.process_avg(std);
        process.process_pass(std);

        ScorePrint print = new ScorePrint();
        print.title();
        print.show(std);
  }
}
