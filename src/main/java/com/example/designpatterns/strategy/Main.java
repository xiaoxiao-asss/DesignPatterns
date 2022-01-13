package com.example.designpatterns.strategy;



public class Main {

    public static void main(String[] args) {
        Cat[] cat={new Cat(5,"1234"),new Cat(4,"1234")};

        Sort<Cat> catSort=new Sort<>();
        catSort.compare(cat,(o1,o2)->{
            if(o1.id>o2.id){
                return 1;
            }else if(o1.id<o2.id){
                return -1;
            }else{
                return 0;
            }
        });


        for (Cat cats : cat) {
            System.out.println(cats);
        }
    }

}
