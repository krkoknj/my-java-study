package com.example.javajungsuk.lamdastreamsec;

import java.util.function.Function;

public class MyStream {
  public static void main(String[] args) {
//    Function<String, Integer> stringIntegerFunction = (String s) -> Integer.parseInt(s);
    Function<String, Integer> stringIntegerFunction = Integer::parseInt;
    Integer apply = stringIntegerFunction.apply("1");
    int plus = apply + 10;
    System.out.println("plus = " + plus);
  }
}
