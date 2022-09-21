package com.example.javajungsuk.thread;

import javax.swing.*;

public class SingleCountdown {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
    System.out.println("입력하신 값은 = " + input);

    for (int i = 10; i > 0; i--) {
      System.out.println("i = " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("e.getMessage() = " + e.getMessage());
      }

    }
  }
}
