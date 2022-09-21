package com.example.javajungsuk.thread;


public class SingleMulti2 {
  static long startTime = 0;

  public static void main(String[] args) {
//    Runnable r = new Thread2_1();
    Thread2_1 t = new Thread2_1();

    t.start();
    startTime = System.currentTimeMillis();

    for(int i=0; i < 300; i++) {
      System.out.printf("%s", new String("|"));
    }

    System.out.print("소요시간 main : " + (System.currentTimeMillis() - SingleMulti2.startTime));
  }
}

class Thread2_1 extends Thread {

  @Override
  public void run() {
    for(int i=0; i < 300; i++) {
      System.out.printf("%s", new String("-"));
    }
    System.out.print("소요시간 thread : " + (System.currentTimeMillis() - SingleMulti2.startTime));
  }
}