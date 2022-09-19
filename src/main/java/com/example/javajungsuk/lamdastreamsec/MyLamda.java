package com.example.javajungsuk.lamdastreamsec;

public class MyLamda {
  public static void main(String[] args) {
    Object obj = new Object() {
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };

//    int value = obj.max(3, 5);


  }
}
