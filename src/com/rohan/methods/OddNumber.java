package com.rohan.methods;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
         int result = display(n);
        System.out.print("The Sum is " + result);
    }
    public static int display(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
