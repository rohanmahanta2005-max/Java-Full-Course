package com.rohan.Patterns;

public class Alphabets {
    public static void main(String[] args){
        System.out.print("enter rows: ");
        int row = input.num();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }

    }
}
