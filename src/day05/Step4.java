package day05;  // 패키지 이름

import java.util.Scanner;

public class Step4 {    // class S
    public static void main(String[] args) {    // main S

        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[0];
        while (true){
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int ch = scanner.nextInt();scanner.nextLine();

            if(ch == 1){
                System.out.print("학생수> ");
                int snum = scanner.nextInt();scanner.nextLine();
                scores = new int[snum];
            } else if(ch==2) {
                for(int i = 0; i< scores.length; i++){
                    System.out.print("scores["+i+"]: ");
                    scores[i] = scanner.nextInt();scanner.nextLine();
                }

            } else if(ch==3) {
                for(int i = 0; i< scores.length; i++){
                    System.out.println("scores["+i+"]:" + scores[i]);
                }
            } else if(ch==4) {
                int max = 0;
                int sum = 0;
                for(int i = 0; i< scores.length;i++){
                    if(scores[i] >= max){
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                double avg = (double) sum/scores.length;
                System.out.println("최고 점수: " + max);
                System.out.printf("최고 평균: %.1f\n" ,avg);

            } else if(ch==5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }   // main E
} // class E
