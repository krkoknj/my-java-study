package com.example.javajungsuk.inheritance;

import lombok.Getter;
import lombok.Setter;

public class MyPoint {
  public static void main(String[] args) {
    Point point3D =  new Point3D(1,2);
    Point point = new Point(3, 4);
    Point3D point3D1 = new Point3D(1, 2);
    System.out.println("point3D = " + point3D);
    System.out.println("point = " + point);
    System.out.println("point3D.getX() = " + point3D.getX());
    System.out.println("point.getX() = " + point.getX());
    System.out.println(point3D1.getX());
  }
}

class Point {
  int x;
  int y;

  public int getX() {
    System.out.println("getX()");
    return x;
  }

  public void setX(int x) {
    System.out.println("setX()");
    this.x = x;
  }

  public int getY() {
    System.out.println("getY()");
    return y;
  }

  public void setY(int y) {
    System.out.println("setY()");
    this.y = y;
  }

  public Point(){
    System.out.println("Point()");
  }

  public Point(int x, int y) {
    System.out.println("Point(int x, int y)");
    this.x = x;
    this.y = y;
  }
}

class Point3D extends Point{
  int z;

  public int getZ() {
    System.out.println("getZ()");
    return z;
  }

  public void setZ(int z) {
    System.out.println("setZ()");
    this.z = z;
  }

  public Point3D() {
    System.out.println("Point3D()");
  }

  public Point3D(int x, int y) {
    super(x,y);
    System.out.println("Point3D(int x, int y)");
  }
}
