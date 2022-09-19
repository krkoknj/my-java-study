package com.example.javajungsuk.lamdastream;

import java.io.File;
import java.util.stream.Stream;

public class MyTestStream2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
            new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) // 확장자 없는 것은 제외
                .peek(s -> System.out.println("filename= " + s))
                .map(s -> s.substring(s.indexOf('.') + 1))
                .peek(s -> System.out.println("extension = " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("toUpperCase filename = " + s))
                .distinct()
                .forEach(System.out::println);

        System.out.println();
    }
}
