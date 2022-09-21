package com.example.javajungsuk.thread;

import javax.swing.*;

public class MultiCountdown {
  public static void main(String[] args) {
    ThreadMulti t = new ThreadMulti();
    t.start();

    String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
    System.out.println("입력하신 값은 = " + input);
  }
}

class ThreadMulti extends Thread {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("i = " + i);
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("e.getMessage() = " + e.getMessage());
      }
    }
  }
}