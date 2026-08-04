package com.rohan.Patterns;

public class ReverseStarTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Rows: ");
        int n = input.num();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
