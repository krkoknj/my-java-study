package com.example.javajungsuk.lamdastream;

import java.util.Optional;

public class MyTestLamda4 {
    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

        Optional<String> optionalS = Optional.empty();
//        Optional<String> optionalS = Optional.of("aaa");
        System.out.println("optionalS = " + optionalS);
//        System.out.println("optionalS.get() = " + optionalS.get());

        String str = "";

//        try {
//            str = optionalS.get();
//        } catch (Exception e) {
//            str = "";
//        }

//        str = optionalS.orElse("EMPTY");

        str = optionalS.orElseGet(String::new);
        System.out.println("str = " + str);
    }
}
