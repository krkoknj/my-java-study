package com.example.javajungsuk.inheritance;

class PointTest {
  int x;
  int y;
}

/*class Circle extends PointTest {
  int r;
}*/

class Circle {
  PointTest p = new PointTest();
  int r;
}

public class InheritanceTest {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.p.x = 1;
    c.p.y = 2;
    c.r = 3;
  }
}
