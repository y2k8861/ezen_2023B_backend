package day16;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인테페이스 변수 선언
        RemoteControl rc;
        // 2. 인터페이스 변수에 객체참조 값 대입
        rc = new Television();  // - 다형성
            // RemoteControl rc = new Television();
            // 타입이 다른데 가능한 이유 : extends, implements
        // 3. 인터페이스의 메소드를 호출하면 구현객체의 메소드가 호출된다.
        rc.turnOn();
        rc.setValume(5);
        rc.turnOff();

        // 다형성(교체)
        rc = new Audio();
        rc.turnOn();
        rc.setValume(15);
        rc.turnOff();

        RemoteControl rc2 = new Television();
        rc2.turnOn();

        rc = new Tv2();
        rc.turnOn();
        rc = new Audio2();
        rc.turnOn();

        Television tv = new Television();
        Audio ad = new Audio();
        rc = tv;
        rc.turnOn();
        rc = ad;
        rc.turnOn();

        // 인터페이스의 상수필드 호출
        System.out.println(RemoteControl.MAX_VALUME);
        System.out.println(RemoteControl.MIN_VALUME);
    }
}
