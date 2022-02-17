package com.example.designpatterns.iterator.v5;

public interface Collection {

    void add(Object object);
    int size();

    Iterator_ iterator();
}
