package com.rohan.Patterns;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        System.out.print("Enter rows: ");
        int row = input.num();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
