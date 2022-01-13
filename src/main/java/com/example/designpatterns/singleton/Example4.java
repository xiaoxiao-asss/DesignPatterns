package com.example.designpatterns.singleton;

/**
 * 单例 饿汉模式
 */
public enum  Example4 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Example4.INSTANCE.hashCode())).start();
        }
    }


}
