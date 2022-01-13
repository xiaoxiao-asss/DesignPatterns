package com.example.designpatterns.singleton;

/**
 * 单例 静态类方式
 */
public class Example3 {

    private Example3(){

    }

    private static class Test{
      private static final Example3 EXAMPLE_3=new Example3();
    }


    public static Example3 getInstance(){
        return Test.EXAMPLE_3;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Example3.getInstance())).start();
        }
    }
}
