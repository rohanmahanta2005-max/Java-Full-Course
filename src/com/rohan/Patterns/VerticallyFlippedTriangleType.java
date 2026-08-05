package com.rohan.Patterns;

public class VerticallyFlippedTriangleType {
    public static void main(String[] args){
        System.out.print("Enter rows: ");
        int n = input.num();

         for(int i=1; i<=n; i++){
             for(int j=1; j<=i-1; j++){
                 System.out.print("  ");
             }
             for (int j=1; j<=n+1-i; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
