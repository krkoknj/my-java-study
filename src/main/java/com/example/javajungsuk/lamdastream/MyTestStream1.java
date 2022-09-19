package com.example.javajungsuk.lamdastream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MyTestStream1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 2, 200),
                new Student("나자바", 1, 100),
                new Student("박자바", 2, 150),
                new Student("심자바", 1, 200),
                new Student("지자바", 3, 290),
                new Student("소자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getName)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

}