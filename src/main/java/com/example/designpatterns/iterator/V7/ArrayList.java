package com.example.designpatterns.iterator.V7;

public class ArrayList<E> implements Collection<E> {

    E[] arrs=(E[])new Object[10];
    int index=0;

    @Override
    public void add(E element) {
        if(arrs.length==index){
            E[] arr=(E[])new Object[arrs.length*2];
            System.arraycopy(arrs,0,arr,0,arrs.length);
            arrs=arr;
        }
        arrs[index]=element;
        index++;


    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator<E> iterator() {

        return new ListIterator<E>();
    }

    private class ListIterator<E> implements Iterator<E>{
        int currentIndex=0;

        @Override
        public boolean hasNext() {
           return currentIndex!=index;
        }

        @Override
        public E next() {
            E ele= (E) arrs[currentIndex];
            currentIndex++;
            return ele;
        }
    }

}
