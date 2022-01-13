package com.example.designpatterns.strategy;

import java.util.Comparator;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.id > o2.id) return -1;
        else if (o1.id < o2.id) return 1;
        else return 0;
    }
}
