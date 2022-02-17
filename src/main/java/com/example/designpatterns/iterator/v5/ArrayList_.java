package com.example.designpatterns.iterator.v5;


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

    @Override
    public Iterator_ iterator() {

        return new ArrayList_Iterator();
    }


    private class ArrayList_Iterator implements Iterator_ {
        int currentIndex=0;

        @Override
        public boolean hasNext() {
            if(currentIndex>=index){
                return false;
            }
            return true;

        }

        @Override
        public Object next() {
           Object object= objects[currentIndex];
            currentIndex++;
            return object;
        }
    }


}
