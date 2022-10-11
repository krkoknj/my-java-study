package com.example.javajungsuk.generics2;

import java.util.ArrayList;

class Fruit2 implements Eatable{
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    @Override
    public String toString() {
        return "Apple";
    }
}
class Grape2 extends Fruit2 {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    @Override
    public String toString() {
        return "Toy";
    }
}

interface Eatable { }



public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox2 = new FruitBox2<>();
        FruitBox2<Apple2> apple2FruitBox2 = new FruitBox2<>();
        FruitBox2<Grape2> grape2FruitBox2 = new FruitBox2<>();
//        FruitBox2<Toy2> toyFruitBox2 = new FruitBox2<>();

        fruitBox2.add(new Fruit2());
        fruitBox2.add(new Apple2());
        fruitBox2.add(new Grape2());

        apple2FruitBox2.add(new Apple2());
        grape2FruitBox2.add(new Grape2());

        System.out.println("grape2FruitBox2 = " + grape2FruitBox2);
        System.out.println("apple2FruitBox2 = " + apple2FruitBox2);
        System.out.println("fruitBox2 = " + fruitBox2);
    }
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T>{

}
class Box2<T> {
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
