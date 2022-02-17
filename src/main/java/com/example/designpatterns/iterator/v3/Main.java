package com.example.designpatterns.iterator.v3;


/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 * v4:用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 * 作业：实现LinkedList的Iterator
 * v6:JDK的容器实现
 * v7:实现泛型版本
 */

/**
 * 可以切换实现
 */
public class Main {

    public static void main(String[] args) {
       Collection collection=new ArrayList_();   //new LinkedList_();
       collection.add(1);
       collection.add(2);
        System.out.println( collection.size());



    }
}

