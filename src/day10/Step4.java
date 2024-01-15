package day10;

public class Step4 {    // class S
    public static void main(String[] args) {    // main S

        // 0. 인스턴스필드 호출
            // : 오류 인스턴스필드 사용시 객체 필요
        // System.out.println(Calculator.pi2);

        // 1. 정적필드 호출
        System.out.println(Calculator.pi);
        
        double result1 = 10 * 10 * Calculator.pi;
        
        // 0. 인스턴스메소드 호출
            // 오류 : 인스턴스 메소드 사용시 객체 필요.
        // Calculator.plus2(10,5)
        // 2. 정적 메소드 호출
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

    }   // main E
}   // class E
