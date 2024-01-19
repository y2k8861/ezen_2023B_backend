package day13;

public class Computer extends Calculator { // class S

    /*
        오버라이딩 :
            - 부모에게 물려받은 메소드가 이상적으로 적합하지 않을 때
            1. 상위클래스의 메소드 재정의한다.
            2. 재정의(@Override)된 메소드가 우선순위를 갖는다
    */
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle 사용");
        return Math.PI * r * r;
    }
}   // class E
