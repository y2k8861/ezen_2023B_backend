package day14;

public class Step3 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Car myCar = new Car();
            // myCar.tire = null;
        // 2. 객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();
            // myCar.tire = tire 객체 참조;
        myCar.run();
        // -------- 필드 다형성 : 필드가 가지고 있는 객체참조
        myCar.tire = new HankookTire();
            // myCar.tire = HankookTire 객체참조;
        myCar.run();
        //
        myCar.tire = new KumhoTire();
        myCar.run();

        myCar.price = 100;
        myCar.setPrice(myCar.getPrice() + 100);
        System.out.println(myCar.price);
    }
}
