package com.example.designpatterns.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 单例 懒汉模式
 */
public class Example2 {

    private static volatile Example2 example1;

    private Example2(){

    }

    public static Example2 getInstance()   {
        if(example1==null){
//            TimeUnit.SECONDS.sleep(1);  //实际可不加,延迟下更容易看出线程安全问题
            synchronized (Example2.class){
                if(example1==null){
                    example1=new Example2();
                }
            }
        }
        return example1;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Example2.getInstance())).start();
        }
    }
}
