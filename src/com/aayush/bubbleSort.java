package com.aayush;

public class bubbleSort {
    public static void main(String[] args) {
        int [] a = {1,7,5,2,3};
        System.out.println("Before Bubble Sort: ");
        for(int i: a)
            System.out.println(i);
        System.out.println("After Sorting: ");
        bubbleSortMethod(a);
        for(int i: a)
            System.out.println(i);
    }

    private static void bubbleSortMethod(int[] a) {
        int temp = 0;
        for (int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length-i; j++){
                if(a[j-1]>a[j]){
                    //Swap elemnts
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
