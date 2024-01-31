package day22;

public interface Rentalbe <P> {
    // 인터페이스 제네릭타입 가능
    // 1. 추상메소드(public abstract 생략가능)
        // 메소드의 반환타입을 제네릭타입 P
    public abstract P rent();
    // 구현 클래스 : 추상메소드의 실행부를 오버라이딩. / 추상메소드의 반환타입 정의
}
