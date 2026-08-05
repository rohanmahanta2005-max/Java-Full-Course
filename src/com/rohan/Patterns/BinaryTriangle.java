package com.rohan.Patterns;

public class BinaryTriangle {

    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int m = input.num();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
