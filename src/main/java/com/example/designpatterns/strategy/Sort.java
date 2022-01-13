package com.example.designpatterns.strategy;

import java.util.Comparator;

public class Sort<T> {
    public void compare(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length-1; i++) {
            int index=i;
            for (int j = i+1; j <arr.length ; j++) {
                index=comparator.compare(arr[i],arr[j])==-1?i:j;
            }

            swap(arr,i,index);
        }
    }

    private  void swap(T[] arr, int i, int j) {
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
