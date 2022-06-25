package com.syntax.class18;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    public static void main(String args[]){
        System.out.println("list of all elements to sum: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("list of all elements one by one to sum: ");

        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Sum of the elements of the array: "+sum);
    }
}
