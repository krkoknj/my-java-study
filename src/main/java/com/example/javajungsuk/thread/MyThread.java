package com.example.javajungsuk.thread;

public class MyThread {
  public static void main(String[] args) {
    MyThread1_1 t1 = new MyThread1_1();

    Runnable r = new MyThread1_2();
    Thread t2 = new Thread(r);

    t1.start();
    t2.start();
  }
}

class MyThread1_1 extends Thread{
  public void run() {
    for (int i = 0; i < 500; i++) {
//      System.out.println(this.getName()); // 조상인 Thread의 이름을 가져온다
      System.out.print(0);
    }
  }
}

class MyThread1_2 implements Runnable{
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
//      Thread.currentThread(); - 현재 실행중인 Thread를 반환한다.
//      System.out.println(Thread.currentThread().getName());
      System.out.print(1);
    }
  }
}