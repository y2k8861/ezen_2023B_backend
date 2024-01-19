package day13;

public class Step2 {    // class S
    public static void main(String[] args) {    // main S
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
    }   // main E
}   // class E
