package com.aayush;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        //Step 1:
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        a.append(sc.nextLine());
        System.out.println("The reverse is: "+a.reverse());

        //Step 2:
        int x = sc.nextInt();
        String con = String.valueOf(x);
        String reverse = "";
        for(int i=con.length()-1; i>=0; i--){
            reverse += con.charAt(i);
        }
        System.out.println(Integer.valueOf(reverse));
    }
}
