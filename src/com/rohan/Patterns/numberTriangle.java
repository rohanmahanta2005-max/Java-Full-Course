package com.rohan.Patterns;

public class numberTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int row = input.num();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
