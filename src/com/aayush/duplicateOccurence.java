package com.aayush;

public class duplicateOccurence {
    public static void main(String[] args) {
        int a[] = {1,2,5,3,4,5};
        for (int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if (a[i] == a[j]){
                    System.out.println("The value is: "+a[i]);
                    break;
                }
            }
        }
    }
}
