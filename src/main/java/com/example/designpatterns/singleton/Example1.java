package com.example.designpatterns.singleton;

/**
 * 单例 饿汉模式
 */
public class Example1 {

    private static final Example1 EXAMPLE_1=new Example1();

    private Example1(){

    }

    public static Example1 getInstance(){
        return EXAMPLE_1;
    }
}
