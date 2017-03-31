package org.dimigo.oop;

import java.util.Scanner;

/**
 * Created by 12bra on 2017-03-31.
 */
public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions ={"가장좋아하는 가수는? ", "가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
        String[] answers = {"gnash", "leonardo dicaprio", "java"};
        for (int i =0; i<3;i++){
            System.out.println((i+1)+"." +questions[i]);
            String answer = scanner.nextLine();
            if(answer.equals(answers[i])) {
                System.out.println("정답입니다!");
            }
            else System.out.println("틀렸습니다!");
        }
        System.out.println("<< 결과 출력 >>");
        for(int i=0;i<3;i++){
            StringBuilder sb = new StringBuilder(questions[i]);
            sb.append(" ").append(answers[i]).append("입니다.");

            System.out.println(sb);
        }


    }
}
