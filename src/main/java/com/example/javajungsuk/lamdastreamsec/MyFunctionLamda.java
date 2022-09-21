package com.example.javajungsuk.lamdastreamsec;

@FunctionalInterface
interface MyFunctionWithRun {
  void run();
}

public class MyFunctionLamda {

  static void execute(MyFunctionWithRun functionWithRun) {
    functionWithRun.run();
  }

  static MyFunctionWithRun getMyFunction() {
//    MyFunctionWithRun f = () -> System.out.println("f3.run()");
//    return f;
    return () -> System.out.println("f3.run()");
  }

  public static void main(String[] args) {
    // 람다식으로 MyFunctionWithRun 의 run()을 구현
    MyFunctionWithRun f1 = () -> System.out.println("f1.run()");

    MyFunctionWithRun f2 = new MyFunctionWithRun() { // 익명클래스로 run()을 구현
      @Override
      public void run() { // public을 반드시 붙여야 함
        System.out.println("f2.run()");
      }
    };

    MyFunctionWithRun f3 = getMyFunction();

    f1.run();
    f2.run();
    f3.run();

    execute(f2);
    execute(() -> System.out.println("run()"));

  }
}
