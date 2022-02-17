package com.example.designpatterns.iterator.v5;

public class Main {
    public static void main(String[] args) {

        Collection collection=new LinkedList_();
        collection.add(1);
        collection.add("TEST");
        collection.add(2);
        Iterator_ iterator_=collection.iterator();
        while (iterator_.hasNext()){
            System.out.println(iterator_.next());
        }

    }
}
