package day11.exam01.package2;

import day11.exam01.package1.B;

public class C {
    // 다른 패키지내(default/puplic) 클래스 호출
    // A a;    // 오류발생 : default 클래스는 다른패키지에서 시용 불가
    B b;    // public 클래스는 다른패키지에서 사용가능
}
