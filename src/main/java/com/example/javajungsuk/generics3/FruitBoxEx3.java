package com.example.javajungsuk.generics3;

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
class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }

        return new Juice(tmp);
    }
}
public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("Juicer.makeJuice(fruitBox) = " + Juicer.makeJuice(fruitBox));
        System.out.println("Juicer.makeJuice(appleBox) = " + Juicer.makeJuice(appleBox));
    }
}


class FruitBox<T extends Fruit> extends Box<T> {

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

    ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
