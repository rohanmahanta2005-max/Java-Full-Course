package com.rohan.Patterns;

public class starRectangle {
    public static void main(String[] args){
        System.out.print("enter rows: ");
        int row = input.num();

        System.out.print("enter columns: ");
        int col = input.num();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
