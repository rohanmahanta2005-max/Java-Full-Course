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
    public static void displayArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j<columns) {
                System.out.print("Enter enter element rows: " +(i+1)
                        + ", columns: " +(j+1) + " element" + " : " );
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}
