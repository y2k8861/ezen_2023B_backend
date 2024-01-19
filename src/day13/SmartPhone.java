package day13;

/*
    상속
        - 클래스의 재사용해서 새로운 클래스들을 만들때 중복되는 코드를 줄여 개발시간을 단축/ 유지보수
        1. 부모클래스의 필드/메소드를 자식클래스에게 물려받는다.
        2. 자식이 부모를 선택한다.
        3. 자식클래스 선언시 클래스명 뒤에 extends
        4. 자식클래스가 가질수 있는 부모의 개수는 1개 = 다중 상속 불가능.
            1. 설계
*/

public class SmartPhone extends Phone {
    // 1. 필드
    public boolean wife;

    // 2. 생성자
    public SmartPhone(String model, String color){
        // - 생선자 첫줄에 부모 생성자 호출한다. ( 생략가능 - 컴파일시 자동 추가)
        super();
        // * this : 현재 객체 뜻하는 키워드
        this.model = model;
        this.color = color;
    }

    // 3. 메소드
    public void setWife(boolean wife){
        this.wife = wife;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
