package com.example.javajungsuk.generics2;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}
public class FruitBox1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
//        Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        System.out.println("fruitBox = " + fruitBox);

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println("appleBox = " + appleBox);

        toyBox.add(new Toy());
        System.out.println("toyBox = " + toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}