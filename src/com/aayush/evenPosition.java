package com.aayush;

import java.util.Scanner;

public class evenPosition {
    public static void main(String[] args) {
        int size = 5;
        int a[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<size; i=i+2){
            System.out.println(a[i]);
        }
    }
}
