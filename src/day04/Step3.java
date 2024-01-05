package day04;  // 패키지 이름

import java.util.Scanner;

public class Step3 {    // class S
    public static void main(String[] args) {    // main S

        Scanner scanner = new Scanner(System.in);
        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [on/off]
        int speed = 0;  // 현재 속도를 지정하고 있는 변수 [1입력하면 1증가, 2입력하면 1감소]
        
        while (run){    // 무한루프 시작
            // ================= 무한 반복 출력 ================= //
            System.out.println("------------------------------------");
            System.out.println("1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프 종료)");    // 메뉴판
            System.out.println("------------------------------------");
            System.out.print("선택 : ");
            // ================= ================= ================= //
            // ================= 무한 반복 입력 ================= //
            String strNum = scanner.next(); // 엔터를 입력할때 까지 'console이 대기' 상태로 됨.
            // ================= ================= ================= //
            // ================= 입력값에 따른 경우의 수 판단 ================= //
            if(strNum.equals("1")){ // 만약에 입력받은 값(문자열) 문자 1이면 [문자 비교시에는 equals()]
                speed++;
                System.out.println("현재 속도는 " + speed);
            } else if(strNum.equals("2")){  // 만약에 입력받은 값(문자열) 문자 2이면
                speed--;
                System.out.println("현재 속도는 " + speed);
            } else if(strNum.equals("3")){  // 만약에 입력받은 값(문자열) 문자 3이면
                // 1.
                run = false;
                // 2.
                //break;  // 가장 가까운 반복문 탈출 키워드;
                // 현재 기준에서는 가장 가까운 반복문 문한루프 이니까;

                // return; // 현재 함수 종료
            }
        }   // 무한루프 끝
    }   // main E
}   // class E

/*
    무한루프 = 무한반복
        - 주의할점 : 무한루프 종료하는 조건은 필수.
        1.
            while(true){}
        2. 
            boolean run = true;
            while(run){}
*/
