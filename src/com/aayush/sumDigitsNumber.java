package com.aayush;

import java.util.Scanner;
/*
public class sumDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add = 0;
        Integer a = sc.nextInt();
        while (a > 0){
            add += a % 10;
            a = Math.floorDiv(a, 10);
        }
        System.out.println("The Sum is: "+add);
    }
}*/

// Sum of first and last number

public class sumDigitsNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add = 0;
        Integer a = sc.nextInt();
        Integer lastDigit = a % 10;
        Integer firstDigit = a;
        while (firstDigit > 10){
            firstDigit = Math.floorDiv(firstDigit,10);
        }
        System.out.println("The first digit is: "+firstDigit+" and the last digit is: "+lastDigit);
        System.out.println("The sum is: "+(firstDigit+lastDigit));
    }
}
