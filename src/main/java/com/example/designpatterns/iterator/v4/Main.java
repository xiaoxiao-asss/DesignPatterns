package com.example.designpatterns.iterator.v4;

public class Main {
    public static void main(String[] args) {

        Collection collection=new ArrayList_();
        collection.add(1);
        collection.add(2);

        //System.out.println(collection.size());

        //遍历方法不能通用，linkedList内部不是数组无法使用fori
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(((ArrayList_)collection).objects[i]);
        }

    }
}
