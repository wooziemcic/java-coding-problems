package com.aayush;
import java.util.*;
public class coding {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String a = sc.nextLine();
    int initiallenght = a.length();
    System.out.println("Enter the character: ");
    String x = sc.next();
    String change = a.replace(x, "");
    int finallength = change.length();
    System.out.println("The occurence is: "+(initiallenght-finallength));
  }
}
