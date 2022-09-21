package com.example.javajungsuk.lamdastreamsec;

import java.util.function.Function;

public class MyTest {
  public static void main(String[] args) {
//    Function<String, Integer> t = (s) -> Integer.parseInt(s);
    Function<String, Integer> t = Integer::parseInt;

    int apply = t.apply("100") + 200;
    System.out.println("apply = " + apply);
  }

}
