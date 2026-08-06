package com.rohan.Patterns;

public class Bridge {
    public static void main(String[] args) {
        System.out.print(" Enter rows: ");
        int n = input.num();


        for (int i = 1; i <= 2*n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        for (int i=1; i<=n-1 ; i++) {            //Lines

            for (int j = 1; j <= n - i; j++) {    // Stars
                System.out.print("* ");
            }


            for (int j = 1; j <= nsp; j++) {      //Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n - i; j++) {     //Stars
                System.out.print("* ");
            }
            nsp += 2;
            System.out.println();


        }
    }
}
