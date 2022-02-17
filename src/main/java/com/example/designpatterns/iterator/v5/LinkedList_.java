package com.example.designpatterns.iterator.v5;



class LinkedList_ implements Collection {

    Node head = null;

    Node tail = null;

    int index = 0;

    public void add(Object object) {
        Node node = new Node(object);

        if (tail == null) {
            tail = node;
            head = node;
        }

        tail.next = node;
        tail = node;
        index++;
    }


    public int size() {
        return index;
    }

    @Override
    public Iterator_ iterator() {


        return new List_Iterator();
    }

    private class List_Iterator implements Iterator_ {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex == index) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            Node node = head;
            for (int i = 0; i < currentIndex; i++) {
                node = node.next;
            }
            currentIndex++;
            return node.object;
        }
    }


    private class Node {
        Object object;
        Node next;

        public Node(Object object) {
            this.object = object;
        }
    }

}


