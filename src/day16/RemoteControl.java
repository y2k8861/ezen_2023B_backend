package day16;

    // 추상클래스와 인터페이스를 사용하는 이유 : *다형성

public interface RemoteControl {    // 텔레비전,오디오 조작하는 리모컨

    // 인터페이스는 인스턴스 필드와 정적 필드를 가질 수 없다.
    // 상수 필드 : public static final
    int MAX_VALUME = 10;
    public static final int MIN_VALUME = 0; // [public static final] 생략이 가능하다.

    // 추상 메소드 (공통 메소드) : 서로 다른 객체들간의 공통적인 메소드를 추출한 것
        // - 1. 선언부만 작성하구 구현부는 하지 않는다.
        // - 2.
            // 추상클래스의 public 추상메소드는 abstract 필수로 작성한다.
            // 인터페이스의 public 추상메소드는 abstract 생략이 가능하다.
        // - 텔레비전과 오디오의 공통적인 메소드 추출 ( = 전원버튼 )

    // 구현클래스 : 추상메소드를 구현한 클래스
        // - 구현 클래스가 꼭꼭 필요한 이유
        // 1. 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.

    void turnOn();
    public abstract void turnOff(); // [public abstract] 생략가능
    void setValume(int valume);
}
