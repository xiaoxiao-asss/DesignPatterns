package com.example.designpatterns.iterator.v3;

class ArrayList_ implements Collection {
    Object[] objects = new Object[10];

    int index = 0;

    @Override
    public void add(Object object) {
        if (index >= objects.length) {
            Object[] objectss = new Object[10 * 2];
            System.arraycopy(objects, 0, objectss, 0, objects.length);
            objects = objectss;
        }
        objects[index]=object;
        index++;
    }

    @Override
    public int size(){
        return index;
    }


}
