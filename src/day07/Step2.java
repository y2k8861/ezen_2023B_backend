package day07;  // 패키지 이름

// ===== 클래스 용도 : 2. 실행클래스 ===== //
public class Step2 {    // class S
    public static void main(String[] args) {    // main S

        // [p.215]
        // 1. 객체 생성
            // 1. new
        // new;
            // 2. 생성자/클래스명
        // new 생성자/클래스명();
            // 3. 변수 선언
        // Car car ;
            // +
        Car car = new Car();

        // . : 접근연산자 : 변수가 가지고 있는 주소로 이동
        System.out.println("모델명 : " + car.model);
        System.out.println("시동여부 " + car.strat);
        System.out.println("현재속도 : " + car.speed);

        Car yourCar = new Car();

        System.out.println("모델명 : " + yourCar.model);
        System.out.println("시동여부 " + yourCar.strat);
        System.out.println("현재속도 : " + yourCar.speed);

        // [p.217]
        // * 필드는 객체의 데이터 이므로 객체가 존자하지 않으면 존재하지 않는다.
            // 1. 객체 생성
        // new Car2();


        Car2 car2 = new Car2();

        System.out.println("제작회사 : " + car2.compay);
        System.out.println("모델명 : " + car2.model);
        System.out.println("색깔 : " + car2.color);
        System.out.println("최고속도 : " + car2.maxSpeed);
        System.out.println("현재속도 : " + car2.speed);

        car2.speed = 60;
        System.out.println("현재속도 : " + car2.speed);

        Car2 yourCar2 = new Car2();
        System.out.println("제작회사 : " + yourCar2.compay);
        yourCar2.speed = 100;
        System.out.println("현재속도 : " + yourCar2.speed);


    }   // main E
}   // class E
