package com.example.javajungsuk.lamdastreamsec;

import java.util.function.Function;

public class MyTest {
  public static void main(String[] args) {
//    Function<String, Integer> t = (s) -> Integer.parseInt(s);
    Function<String, Integer> t = Integer::parseInt;

    int apply = t.apply("100") + 200;
    System.out.println("apply = " + apply);

    MyFunction f = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return Math.max(a, b);
      }
    };

    int max = f.max(1, 2);
    System.out.println("max = " + max);

    MyFunction f1 = Math::min;
    MyFunction f2 = (a, b) -> {return a * b;};
    System.out.println("f1.max(5, 9) = " + f1.max(5, 9));
    System.out.println("f2.max(6, 9) = " + f2.max(6, 9));
  }

  // (a, b) -> a > b ? a : b
  // (name, i) -> System.out.println(name +"="+i)
  // x -> x * x
  // () -> (int) (Math.random() * 6)

  @FunctionalInterface
  interface MyFunction {
    int max(int a, int b);
  }
}
