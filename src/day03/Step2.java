package day03;  // 패키지 이름

import java.util.Scanner;

public class Step2 {    // class S
    public static void main(String[] args) {    // main S

        // 객체 사용이유 : 속성/메소드를 패키지화
        Scanner scanner = new Scanner(System.in);

/*
        // 예제 1 : 작성자, 내용, 날짜 3가지를 문자로 받아 출력.
            // 1. 입력, 변수
        System.out.print("작성자 : "); String 작성자 = scanner.next();
        System.out.print("내용 : ");  String 내용 = scanner.next();
        System.out.print("날짜 : ");  String 날짜 = scanner.next();
            // 2. 출력
        System.out.printf("=============== 방문록 ===============\n");
        System.out.printf("%4s %10s %20s %10s \n","번호","작성자","내용","날짜");
        System.out.printf("%5s %10s %20s %10s \n",1,작성자,내용,날짜);

 */

        // 예제 2 : 기본급과 수당 정수로 입력받아 실수령액 꼐산해서 출력
            // 실수령액 : 기본급 + 수당 - 세금[기본금10%]

            // 1. 입력
        System.out.print("기본급 : "); int 기본급 = scanner.nextInt();
        System.out.print("수당 : ");  int 수당 = scanner.nextInt();
            // 2. 처리
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1); // % : 나머지 연산자
            // 오류 나는 이유 : int + int - (int * double) = double
                // 0.1 double형 이므로 int*double 의 결과는 double
                // 그래서 double을 int 에 대입할수 없다 -> 강제 캐스팅.

            // 3. 출력
        System.out.println("실수령액 = " + 실수령액);


    }   // main E
}   // class E
