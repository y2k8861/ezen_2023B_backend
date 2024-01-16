package day11.exam01.package1;

public class A2 {

    // * 필드와 메소드 접근제한자
    public int field1;   // public 필드
    int field2;         // default 필드
    private int field3; // private 필드

    public A2(){
        field1 = 1; // public 필드는 내부에서 접근가능
        field2 = 2; // (default) 필드는 내부에서 접근가능
        field3 = 3; // private 필드는 내부에서 접근 가능

        method1();   // public 필드는 내부에서 접근 가능
        method2();   // default 필드는 내부에서 접근 가능
        method3();   // private 필드는 내부에서 접근 가능
    }

    public void method1(){};
    void method2(){};
    private void method3(){};

    public A2(boolean b){}  // public 생성자
    A2 a1 = new A2(true);   // 내부에서 생성자호출 가능

    A2(int b){} // (default) 생성자
    A2 a2 = new A2(2);   // 내부에서 생성자호출 가능

    private A2(String b){}  // private 생성자
    A2 a3 = new A2("문자열");  // 내부에서 생성자호출 가능
}
