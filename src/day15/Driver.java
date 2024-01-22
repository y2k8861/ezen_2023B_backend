package day15;

public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.run();
        
        // -자식 타입으로 다시 변환. (강제 타입 = 캐스팅 )
        // !!! : instanceof 연산자
        // 변수명 instanceof 타입 : T/F
        System.out.println(vehicle instanceof Bus ? "버스입니다." : "택시입니다.");
        System.out.println(vehicle instanceof Taxi ? "택시입니다." : "버스입니다.");
        System.out.println(vehicle instanceof Object);

        Bus bus2 = new Bus();
    }
}
