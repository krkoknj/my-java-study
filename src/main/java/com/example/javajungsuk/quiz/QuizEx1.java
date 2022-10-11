package com.example.javajungsuk.quiz;

import java.util.Arrays;

class QuizEx1 {
    public static void main(String[] args) {
        String[] data = {
                "다음 중 키워드가 아닌 것은?`2`final`True`if`public",
                "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^",
                "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false",
        };

        String s = Arrays.toString(data);


        for(int i=0;i<data.length;i++) {
            // 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
            String[] split = data[i].split("`", 2);

            // 2. 문제를 출력하세요.
            System.out.println(split[0]);

            // 3. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.
            String[] split1 = split[1].split("`");
            System.out.println("split1 = " + Arrays.toString(split1));

            // 4.반복문을 이용해서 선택지를 출력하세요.
            for (int j = 1; j < split1.length; j++) {
                System.out.println("split[j] = " + j +split[j]);
            }

        }
    } // main
}
