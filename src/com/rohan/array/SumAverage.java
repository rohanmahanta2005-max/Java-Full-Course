package com.rohan.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Sum and average of an array program...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
         for(int j=0; j<n; j++){
             System.out.print("Enter element  " + (j+1) +" : ");
             arr[j] = sc.nextInt();
         }

        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum = sum + arr[i];
            i++;
        }
        int average = sum/arr.length;

    System.out.print("The average of elements " + average + "\nThe sum of elements " + sum);


    }
}
