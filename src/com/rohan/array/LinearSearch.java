package com.rohan.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] arr = ArrayUtility.inputArray();
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
               if(arr[i] == target){
                   flag = true;
                   break;
               }

        }
        if(flag){
            System.out.print("Target found!!");
        }
        else{
            System.out.print("target not found!!");
        }
    }
}







