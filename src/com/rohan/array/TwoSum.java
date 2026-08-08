package com.rohan.array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        System.out.print("Two Sum\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int[] arr = {12,34,1,11,20,45,66};
        boolean result = twoSum(arr,target);
        System.out.println(result);

    }
    public static boolean twoSum(int arr[], int target) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target)
                    return true;

            }

        }
        return false;
    }
}
