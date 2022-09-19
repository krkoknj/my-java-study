package com.example.javajungsuk.lamdastream;

import lombok.Data;

import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaTest4 {
    public static void main(String[] args) {
//        Function<String, Integer> stringIntegerFunction = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        System.out.println(stringIntegerFunction.apply("100") + 200);

//        Supplier<MyClass> aNew = MyClass::new;
        Function<Integer,MyClass> s = MyClass::new;
        MyClass mc = s.apply(100);
        System.out.println(mc.iv);

        int[] x = new int[10];
        Function<Integer,int[]> f = int[]::new;
        System.out.println("f.apply(10).length = " + f.apply(10).length);
    }
}

class MyClass{
    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }

}
