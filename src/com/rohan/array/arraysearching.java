package com.rohan.array;

import java.util.Scanner;

// Array Searching Program;

public class arraysearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {24, 22, 25, 77, 88, 99, 45, 2, 7};
        System.out.println("Array Searching..");
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        boolean isFound = isFound(arr,n);
        if(isFound){
            System.out.println("The number is found in the array");
        }
        else{
            System.out.println("The number is not found in the array");
        }

    }
    public static boolean isFound(int[] arr, int n) {
        int index = 0;
        while (index < arr.length) {
          if (arr[index] == n){
              return true;
        }
        index++;
    }
        return false;
    }
}
