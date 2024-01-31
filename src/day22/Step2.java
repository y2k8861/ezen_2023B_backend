package day22;

public class Step2 {
    public static void main(String[] args) {

        // * 클래서 선언시 객체 필드의 타입을 다양하게 사용하기 위해.
        // - 1.Object,타입변환필요    2.제네릭,<>

        // 1. product 클래스에 Tv타입,String타입 정의.
        Product<Tv,String> product1 = new Product<>();
        /*
            - product 객체의 필드 상태
            private Tv kind;
            private String model;
        */

        // 2. 대입
        product1.setKind(new Tv());     // 해당 kind필드가 tv타입이므로 tv객체 대입 가능.
        product1.setModel("스마트tv");   // 해당 model필드가 String타입으로 String객체 대입 가능

        // 3. 호출
        Tv tv = product1.getKind();
        String model = product1.getModel();

        Product<Car,String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUB자동차");

    }
}
