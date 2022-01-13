package com.example.designpatterns.strategy;


public class Cat implements Comparable<Cat>{
     Integer id;

     String name;

     Integer weight;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        if(this.id>o.id){
            return 1;
        }else if(this.id<o.id){
            return -1;
        }else{
            return 0;
        }
    }
}
