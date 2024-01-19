package day14;

public class Car {
    // 1. 한국타이어 타입 + 하위객체
    HankookTire hankookTire;
    // 2. 금호타이어 타입 + 하위객체
    KumhoTire kumhoTire;
    int price;

    // 3. 타이어 타입 + 하위객체 (한국 타이어, 금호 타이어)
    Tire tire;
    // 4. 객체 + 자바의 모든 객체
    Object object;

    public void run(){
        tire.roll();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
