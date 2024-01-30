package day20;

public class InterfaveClmpl implements InterfaceC {
    // 자식인터페이스 구현할때 부모인터페이스 구현 해야한다,
    // * 추상메소드 또한 상속이 가능하다.
    @Override
    public void methodA() {
        System.out.println("InterfaceClmpl-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceClmpl-methodB() 실행");

    }

    @Override
    public void methodC() {
        System.out.println("InterfaceClmpl-methodC() 실행");
    }
}
