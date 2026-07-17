package com.rohan.array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element  " + (i+1) +" : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
