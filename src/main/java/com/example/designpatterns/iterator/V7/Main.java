package com.example.designpatterns.iterator.V7;


public class Main {

    public static void main(String[] args) {
        Collection collection=new ArrayList<String>();
        collection.add("test");
        collection.add("test");
        collection.add("test");

        System.out.println(collection.size());

        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
