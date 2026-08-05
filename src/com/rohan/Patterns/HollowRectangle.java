package com.rohan.Patterns;

public class HollowRectangle {
    public static void main(String[] args){
        System.out.print("Enter rows: ");
        int m = input.num();
        System.out.print("Enter columns: ");
        int n = input.num();    //

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
