package day10;

public class Calculator {   // class S

    // 클래스 멤머
    // 1. (인스턴스/정적[static]) 필드
    double pi2 = 3.14159; // 인스턴스(객체) 필드
    static double pi = 3.14159; // 정적 필드

    // 2. 생성장

    // 3. (인스턴스/정적[static]) 메소드
    int plus2(int x, int y){
        return x+y;
    }
    static int plus(int x, int y){
        return x+y;
    }

    static  int minus(int x, int y){
        return x-y;
    }

}   // class E
