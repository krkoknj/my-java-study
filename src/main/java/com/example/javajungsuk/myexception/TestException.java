package com.example.javajungsuk.myexception;

public class TestException {


  public static void main(String[] args) {
    TestException2 t2 = new TestException2();
    try {
      t2.catchEx();
    } catch (Exception e) {
      System.out.println("e.getMessage() = " + e.getMessage());
    }
  }

}

class TestException2 {
  public void test() {
    System.out.println("test");
    throw new RuntimeException("test");
  }

  public void catchEx() {
    try {
      System.out.println("try");
      test();
    } catch (Exception e) {
      System.out.println("catch");
      throw new RuntimeException(e);
    }
  }
}

class TestException3 {
  public void test() {

  }
}