package com.example.designpatterns.iterator.v1;

import java.util.Arrays;

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

public class Main {

    public static void main(String[] args) {
        ArrayList_ list_=new ArrayList_();
        list_.add(1);
        list_.add(2);
        list_.add(4);
        System.out.println(list_.size());


        System.out.println(Arrays.toString(list_.objects));




    }
}

class ArrayList_ {
    Object[] objects = new Object[10];

    int index = 0;


    public void add(Object object) {
        if (index >= objects.length) {
            Object[] objectss = new Object[10 * 2];
            System.arraycopy(objects, 0, objectss, 0, objects.length);
            objects = objectss;
        }
        objects[index]=object;
        index++;
    }


    public int size(){
        return index;
    }

}
