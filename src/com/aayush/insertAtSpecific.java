package com.aayush;

import java.util.Scanner;

public class insertAtSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        //taking input
        for (int i = 0; i<a.length-1; i++){
            a[i] = sc.nextInt();
        }
        //printing inital value
        for(int i: a){
            System.out.println(i);
        }
        //taking the value and the location
        int value = sc.nextInt();
        int location = sc.nextInt();
        //main step to replace
        for (int i = a.length-1; i>location; i--){
            System.out.println(a[i]);
            a[i] = a[i-1];
        }
        a[location] = value;
        //displaying result
        for(int i: a){
            System.out.println(i);
        }
    }
}
