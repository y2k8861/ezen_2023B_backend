package day15;

public class Step1 {
    public static void main(String[] args) {

    }
}

/*
     다형성 : 자동타입변환 + 메소드 오버라이딩
        1. 자동타입변환 : 자식 타입 -> 부모타입
        2. 메소드 오버라이딩 : 자식타입에서 부모 타입의 메소드 재정의
    필드[클래스 멤버]의 다형성
    매개변수[메소드의 변수]의 다형성
        - 1. 메소드 호출 정석 : 동일한 타입의 객체
            method1(1) ---> void method1( int a) {}
            method2(new Car()) ---> void method1( Car car ) {}

        - 2. 타입이 달라도 자식 타입이면 가능하다.
            method2(new sportsCar()) ---> void method1( Car car ) {}
*/