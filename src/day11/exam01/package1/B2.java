package day11.exam01.package1;

public class B2 {
    // 같은 패키지
    A2 a1 = new A2(true);   // public 생성자 가능
    A2 a2 = new A2(1);   // (default) 생성자 가능
    // A2 a3 = new A2("문자열")   // private 생성자 불가능

    public void method(){
        A2 a = new A2();

        a.field1 = 1;   // public 필드는 외부에서 접근 가능
        a.field2 = 1;   // default 필드는 외부에서 접근 가능
        //a.field3 = 1; // private 필드는 외부에서 접근 불가능

        a.method1();    // public 필드는 외부에서 접근 가능
        a.method2();    // default 필드는 외부에서 접근 가능
        // a.method3();    // private 필드는 외부에서 접근 불가능
    }
}
