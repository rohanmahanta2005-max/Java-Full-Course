package com.rohan.array;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.print("2D array searching\n");
        Scanner sc = new Scanner(System.in);
         int[][] Arr = ArrayUtility.input2DArray();
        System.out.print("Enter number you want to search: ");
        int n = sc.nextInt();

        boolean isFound = search(Arr,n);
        if(isFound){
            System.out.println("The number was found");
        }
        else{
            System.out.println("The number is not found");
        }

    }
    public static boolean search(int[][] Arr, int n){
        int i=0;
        while(i < Arr.length){
            int j=0;
            while(j < Arr[i].length){
                if(Arr[i][j] == n){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
