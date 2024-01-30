package day20;

public class Step2 {
    public static void main(String[] args) {
        RemoteControl2 rc = new SmartTelevision();

        rc.turnOn();
        rc.trunOff();
        //rc.search("주소");

        Searchable sc = new SmartTelevision();
        sc.turnOn();
        //sc.turnOff();
        sc.search("https://www.youtube.com");
    }
}
