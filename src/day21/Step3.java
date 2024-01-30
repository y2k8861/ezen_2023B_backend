package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();
        car.run2();

        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("기아 타이어가 돌아갑니다.");
            }
        });

        Tire tire = new Tire(){
            int a = 10;
            public void method1(){
                System.out.println("ddd");
            }

            @Override
            public void roll() {
                System.out.println("신발보다 싼 타이어가 굴러갑니다.");
            }
        };

        car.run3(tire);
    }
}
