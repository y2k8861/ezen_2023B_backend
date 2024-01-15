package day10;

public class Step3 {    // class S
    public static void main(String[] args) {    // main S

        // [p.237]
            // 1. 객체 생성
        Car myCar = new Car();
            // 2. 필드에 5 저장.
        myCar.gas = 5;
            // vs
        myCar.setGas(5);

        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("가스를 주입해주세요.");

    }   // main E
}   // class E
