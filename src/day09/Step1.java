package day09;

public class Step1 {    // class S
    public static void main(String[] args) {    // main S
        
        // [p.231]
            // JS 코드를 읽어 주는 역할 : HTML(JS) <-- 브라우저(프로그램[스레드])
            // JAVA 코드 읽오 주는 역할 : MAIN()함수 <-- MAIN 스레드
            // !!!. 필드/메소드를 사용하기 위해서는 꼭!!! 객체가 필요하다.
            // Calculator.powerOn();
        // 1. 객체 생성
            // new Calculator();
        Calculator myCar = new Calculator();
        // 2. 객체내 멤버(필드/메소드) 호출
        myCar.powerOn();
            // *
        new Calculator().powerOn();

        // 3. 메소드 호출 하고 매개변수l
        myCar.plus(5,6);
        // myCar.plus("오","육") // 타입이 불일치
            // - 리턴값이 있는 경우에는 변수에 저장
        int result = myCar.plus(5,6);
        System.out.println("result = " + result);

        // 4.
        int x =10;
        int y = 4;
        double result2 = myCar.divide(x,y);
        System.out.println("result2 = " + result2);

        myCar.powerOff();
        
    }   // main E
}   // class E
