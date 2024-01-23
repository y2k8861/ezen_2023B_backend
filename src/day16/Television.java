package day16;

public class Television implements RemoteControl {
    // 인스턴스 필드
    private int valume;

    // - implements 재정의한 메소드가 있어요! 뜻
    // - 무조건 오버라이딩한다.
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setValume(int valume) {
        if(valume > RemoteControl.MAX_VALUME){
            this.valume = RemoteControl.MAX_VALUME;
        } else if(valume < RemoteControl.MIN_VALUME){
            this.valume = RemoteControl.MIN_VALUME;
        } else {
            this.valume = valume;
        }

        System.out.println("현재 TV 볼륨 : " + this.valume);
    }
}

/*
    오버로딩 : 생성자/메소드에서 매개변수의 타입/개수/순서에 따라 여러개 생성 가능
    오버라이딩 : 메소드에서 extends/implements 한 메소드를 재정의
*/

