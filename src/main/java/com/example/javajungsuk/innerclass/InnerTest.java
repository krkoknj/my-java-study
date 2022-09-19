package com.example.javajungsuk.innerclass;

class A {
    int i = 100;
    B b = new B();
    class B {
        void method() {
//            A a = new A();
//            System.out.println("a.i = " + a.i);
            System.out.println("i = " + i);
        }
    }
}

//class C {
//    A.B b = new B();
//}
public class InnerTest {
    public static void main(String[] args) {
        A a = new A();
        a.b.method();
    }
}
