package day04;  // 패키지 이름

import java.util.Scanner;

public class Step4 {    // class S
    public static void main(String[] args) {    // mian S
        int money = 0;
        test(money);
        // [p.137]
        /*Scanner scanner = new Scanner(System.in);
        int money = 0;

        while (true){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print("선택> ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.print("예금액>");
                money += scanner.nextInt();
            } else if(ch == 2){
                System.out.print("출금액>");
                money -= scanner.nextInt();
            } else if(ch == 3){
                System.out.print("잔고>");
                System.out.println(money);
            } else if(ch == 4){
                break;
            }

        }

        System.out.println("프로그램 종료");*/

    }   // main E

    public static void test(int money){
        System.out.println("프로그램 시작");
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print("선택> ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.print("예금액>");
                money += scanner.nextInt();
            } else if(ch == 2){
                System.out.print("출금액>");
                money -= scanner.nextInt();
            } else if(ch == 3){
                System.out.print("잔고>");
                System.out.println(money);
            } else if(ch == 4){
                break;
            }

        }


        System.out.println("프로그램 종료");
        int test = scanner.nextInt();
        if(test == 1){
            test(money);
        }
    }
}   // class E

/*
    은행 프로그램 구현
        [ 요구사항 설계 ]
        1. 반복적으로 기능 사용 [단* 종료 기능 선택시 종료]
        2. 기능 : 예금, 출금, 잔고, 종료
            예금 : 더하기 작업
            출금 : 빼기 작업
            잔고 : 확인 작업
            종료 : 프로그램을 끝내는 작업
        3. 변수 설정


*/