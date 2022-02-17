package com.example.designpatterns.iterator.V7;

public interface Collection<E> {

    void add(E element);

    int size();

    Iterator<E> iterator();
}
