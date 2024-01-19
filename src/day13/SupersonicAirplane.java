package day13;

public class SupersonicAirplane extends Airplane {   // class S

    /*
        필드/메소드
            1. [내부객체] 선언한 클래스내 호출시
                - 객체 없이 필드/메소드 호출
                - this.필드/메소드
            2. [외부] 선언한 클래스가 아닌 다른 클래스에서 호출시
                - 인스턴스 필드 : new 이용한 객체가 필수!! : 객체변수명.필드/메소드
                - 정적 필드 : 객체가 필요없음 : 클래스명.필드/메소드
            
            super() : 부모클래스의 생성자 호출
            super.메소드() : 부모클래스의 메소드 호출
    */

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public  int flyMode = NORMAL;

    // 메소드
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}   // class E
