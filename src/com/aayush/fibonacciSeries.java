package com.aayush;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        for(int i=1; i<=a; i++){
            System.out.println(a1);
            int sum = a1+a2;
            a1 = a2;
            a2 = sum;
        }
    }
}
