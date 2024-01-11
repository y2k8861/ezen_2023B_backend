package day08;  // 패키지 이름

import java.util.Scanner;

public class Step1 {    // class S
    public static void main(String[] args) {    // main S

        Scanner scanner = new Scanner(System.in);

        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[5];

        while (true){
            System.out.println("1.굽기 2.판매");
            int ch = scanner.nextInt();scanner.nextLine();

            if(ch==1){
                // 1. 객체 생성 : 1. new -> 2. 클래스/생성자();
                붕어빵틀 붕어빵 = new 붕어빵틀();    // (1개의 주소생성) 붕어빵 생성.
                System.out.print("속재료 입력> ");
                String 속재료입력 = scanner.nextLine();
                붕어빵.속재료 = 속재료입력;

                for(int i =0; i<붕어빵트레이.length; i++){
                    if(붕어빵트레이[i] == null){
                        붕어빵트레이[i] = 붕어빵;
                        break;
                    }
                }

            } // if가 끝나면 '붕어빵'의 지역변수는 사라짐 - > 곧 객체도 사라짐.
            if(ch==2){
                System.out.println("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt() - 1;

                // - 자바는 힙영역에 객체를 제거하는 방법을 제공하지 않는다. 그래서 초기값(null) 활용
                for(int i = dNo; i<붕어빵트레이.length-1; i++){
                    붕어빵트레이[i] = 붕어빵트레이[i+1];
                }
                붕어빵트레이[붕어빵트레이.length-1] = null;

            }

            for(int i =0; i<붕어빵트레이.length; i++){
                if(붕어빵트레이[i] == null)break;
                System.out.println(붕어빵트레이[i].속재료+"붕어빵");
            }
        }
    }   // // main E
} // class E

/*
    - 프로그램 : 명령 집합체
    - 프로세스 : 컴퓨터에서 실행중인 프로그램
    - 스레드 : 프로세스마다 1개이상 필수 존재하는 흐름 읽어주는 단위
        main() : main 스레드 포함

        - 스레드1
            - 스택영역                              힙영역                     메소드영역
                - 프레임1(함수호출)                  - 객체(주소)                - 클래스 정보
                    - 지역변수1                         - 필드
                    - 지역변수2
                    - 지역변수3
                    - 지역변수4
                - 프레임2(함수호출)
                - 프레임3(함수호출)

        - 스레드2
            - 스택영역
    변수 :
    값을 저장 : 변수
    데이터 타입 : 값을 저장하는 방식을 결정
    데이터 타입 분류
        - 기본타입
            byte, short, char, int, long, boolean, float, double

        - 참조타입
            - 클래스(String, Scanner, System, Math, Car(정의), Student(정의), 배열타입, 인터페이스, 열거타입)
*/