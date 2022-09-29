package com.example.javajungsuk.inheritance;

class Tv {
  boolean power;
  int channel;

  void power() { power = !power; }
  void channelUp() { ++channel; }
  void channelDown() { --channel; }
}

class SmartTv extends Tv {
  boolean caption;

  void displayCaption(String text) {
    if (caption) {
      System.out.println("text = " + text);
    }
  }
}

public class MyTv {
  public static void main(String[] args) {
    SmartTv stv = new SmartTv();
    Tv tv = new Tv();
    Tv tv1 = new SmartTv();
    System.out.println("stv = " + stv);
    System.out.println("tv = " + tv);
    System.out.println("tv1 = " + tv1);
  }
}
