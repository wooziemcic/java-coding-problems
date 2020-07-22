package com.aayush;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int size = 5;
        int low = 0;
        int high = 5 - 1;
        int a[] = new int [size];
        System.out.println("Enter the elemnets: ");
        for (int i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The array before reverse: ");
        for(int i: a)
            System.out.println(i);
        System.out.println("The array after reverse: ");
        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        for(int i: a)
            System.out.println(i);
    }
}
