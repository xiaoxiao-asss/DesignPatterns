package com.example.designpatterns.iterator.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * jdk自带Iterator
 */
public class Main {

    public static void main(String[] args) {
        Collection collection=new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add("test");

        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
