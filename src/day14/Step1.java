package day14;

/*
        A
      B   C
      D   E
*/
class A {}

class B extends A {}    // B 의 부모는 A

class C extends A {}   // C 의 부보믄 A

class D extends B {}    // D의 부모는 B

class E extends  C {}   // E의 부보는 C
public class Step1 {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

}
