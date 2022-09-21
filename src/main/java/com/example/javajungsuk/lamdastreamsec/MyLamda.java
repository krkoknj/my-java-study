package com.example.javajungsuk.lamdastreamsec;

public class MyLamda {
  public static void main(String[] args) {
    // Object 에는 max라는 메서드가 없어서 호출 불가.
    Object obj = new Object() {
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };

    // MyFunction 인터페이스는 max를 가지고 있어서 호출 가능.
    MyFunction f = new MyFunction() {
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };

    // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
    // 인터페이스의 반환타입과 매개변수가 같아야 호출 가능
    MyFunction f2 = (a, b) -> a > b ? a : b; // 람다식. 익명객체.

    int max = f.max(3, 5);
    System.out.println("max = " + max);

  }

}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction {
  public abstract int max(int a, int b);

}
