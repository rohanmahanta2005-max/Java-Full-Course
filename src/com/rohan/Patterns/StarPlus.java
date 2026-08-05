package com.rohan.Patterns;

public class StarPlus {
    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int m = input.num();
        System.out.print("Enter Columns: ");
        int n = input.num();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n;j++){
                if(i == (m/2)+1 || j == (n/2)+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
