package com.example.designpatterns.iterator.v4;

import com.example.designpatterns.iterator.v3.Collection;

class LinkedList_ implements Collection {

    Node head=null;

    Node tail=null;

   int index=0;

    public void add(Object object) {
        Node node=new Node(object);

        if(tail==null){
            tail=node;
            head=node;
        }

        tail.next=node;
        tail=node;
        index++;
    }


    public int size(){
        return index;
    }

    private class Node {
        Object object;
        Node next;

        public Node(Object object) {
            this.object = object;
        }
    }

}


