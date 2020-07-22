package com.aayush;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        a.append(sc.nextLine());
        System.out.println(a.reverse());
    }
}
