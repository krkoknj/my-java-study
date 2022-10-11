package com.example.javajungsuk.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class WordScramble1 {
    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
        Scanner sc = new Scanner(System.in);


        while (true) {
            String answer = getAnswer(strArr);
            String question = getScrambledWord(answer);
            char[] hint = new char[answer.length()];

            for (int i = 0; i < hint.length; i++) {
                hint[i] = '_';
            }

            while (true) {
                System.out.println("Question:"+question);

                String next = sc.next();

                if (next.equals("q") || next.equals("Q")) {
                    System.exit(0);
                }
                if (answer.equals(next) || answer.toLowerCase().equals(next)) {
                    System.out.println("정답입니다.");
                    break;
                } else {
                    System.out.println("틀렸습니다.");
                    System.out.println("Hint: " + getHint(answer, hint));
                }
            }

        }

    } // main

    public static String getAnswer(String[] strArr) {
        // 내용을 완성하세요.
        int random = (int) (Math.random() * strArr.length);
        return strArr[random];
    }

    public static String getScrambledWord(String str) {
        // 내용을 완성하세요.
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int idx = (int) Math.random() * str.length();

            char tmp = chars[i];
            chars[i] = chars[idx];
            chars[idx] = tmp;
        }


        return Arrays.toString(chars);
    } // scramble(String str)

    public static String getHint(String answer, char[] hint) {
        int count = 0; // 힌트에 포함된 '_'의 개수

        // 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
        for (int i = 0; i < hint.length; i++) {
            if (hint[i] == '_') {
                count += 1;
            }
        }

        // 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
        if (count > 2 ) {
            int v = (int) (Math.random() * answer.length());
            hint[v] = answer.charAt(v);
        }

        //    정답을 다 알려주는 상황이 되지 않게 하기 위함.


        //    [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.

        //    예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면

        //    그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.

        //    Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.

        return new String(hint);
    } // getHint()
}
