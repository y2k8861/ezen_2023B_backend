package day20;

public interface RemoteControl {
    // 멤버
    // 1. 상수[public static final] 필드
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    // 2. 추상[public abstract] 메소드 ******** 구현클래스에서 오버라이딩 필수
    void turnOn(); // 선언부 작성, 실행부 작성 안함
    void turnOff();
    public abstract void setVolue(int volume);

    // 3. 디폴트[default] 인스턴스 메소드
    default void setMute(boolean mute){ // 선언부 작성, 실행부 작성
        if(mute){
            System.out.println("무음 처리 합니다.");
            setVolue(MIN_VOLUME);
        } else {
            System.out.println("무음 해제 합니다.");
        }
    }

    // 4. 정적[static] 메소드
    static void chageBettery(){
        System.out.println("리모콘 건전지를 교환합니다.");
        System.out.println(MIN_VOLUME); // 상수 필드 오출 가능
        // turnOn(); // 불가능
        // setMute() // 불가능
    }

    // 5. private ㅍㄴ public
        // private : 내부 (챈
    private void turnOff2(){};
}
