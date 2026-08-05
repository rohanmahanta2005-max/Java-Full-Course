package com.rohan.Patterns;

public class FloydTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int row = input.num();
        int a = 1;   //Floyd's Beauty

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print( a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
